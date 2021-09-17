package com.regoworld.data.repository.local

import com.regoworld.data.model.cast.CastEntity
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Single

interface CastLocalDataSource {
    fun insertCasts(casts: List<CastEntity>): Completable
    fun getCasts(): Single<List<CastEntity>>
}