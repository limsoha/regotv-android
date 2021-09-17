package com.regoworld.data.repository

import com.regoworld.data.persistence.mapperToCastEntity
import com.regoworld.data.persistence.mapperToRoom
import com.regoworld.data.repository.local.CastLocalDataSource
import com.regoworld.data.repository.remote.CastRemoteDataSource
import com.regoworld.data.utils.NO_DATA_FROM_LOCAL_DB
import com.regoworld.domain.repository.CastRepository
import com.remotemonster.sdk.data.Room
import io.reactivex.rxjava3.core.Flowable
import io.reactivex.rxjava3.core.Single
import java.lang.IllegalStateException
import javax.inject.Inject

class CastRepositoryImpl @Inject constructor(
    private val castRemoteDataSource: CastRemoteDataSource,
    private val castLocalDataSource: CastLocalDataSource
): CastRepository {

    override fun getCasts(): Flowable<List<Room>> {
        return castLocalDataSource.getCasts()
            .onErrorReturn { listOf() }
            .flatMapPublisher { localCasts ->
                if (localCasts.isEmpty()) {
                    getRemoteCasts()
                        .toFlowable()
                        .onErrorReturn { listOf() }
                } else {
                    val local = Single.just(mapperToRoom(localCasts))
                    val remote = getRemoteCasts()  // 서버
                        .onErrorResumeNext { local }
                    Single.concat(local, remote)    // 순서대로 불러옴
                }
            }
    }

    // 인터넷이 끊긴 경우 로컬디비에서 검색
    override fun getLocalCasts(): Flowable<List<Room>> {
        return castLocalDataSource.getCasts()
            .onErrorReturn { listOf() }
            .flatMapPublisher { cachedCasts ->
                if (cachedCasts.isEmpty()) {
                    Flowable.error(IllegalStateException(NO_DATA_FROM_LOCAL_DB))
                } else {
                    Flowable.just(mapperToRoom(cachedCasts))
                }
            }
    }

    //  서버에서 방송목록에서 요청
    override fun getRemoteCasts(): Single<List<Room>> {
        return castRemoteDataSource.getCasts()
            .flatMap {
                castLocalDataSource.insertCasts(mapperToCastEntity(it))
                    .andThen(Single.just(mapperToRoom(mapperToCastEntity(it))))
            }
    }
}