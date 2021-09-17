package com.regoworld.data.repository.remote

import com.remotemonster.sdk.RemonCast
import com.remotemonster.sdk.data.Room
import io.reactivex.rxjava3.core.Single

class CastRemoteDataSourceImpl(private val remonCast: RemonCast) : CastRemoteDataSource {
    override fun getCasts(): Single<List<Room>> {
        remonCast.fetchCasts()
        return Single.create {
            remonCast.onFetch { casts ->
                it.onSuccess(casts)
            }
        }
    }
}