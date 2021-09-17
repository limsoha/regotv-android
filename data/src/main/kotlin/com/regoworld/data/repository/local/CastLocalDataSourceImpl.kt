package com.regoworld.data.repository.local

import com.regoworld.data.persistence.CastDao
import com.regoworld.data.model.cast.CastEntity
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Single

class CastLocalDataSourceImpl(private val castDao: CastDao) : CastLocalDataSource {
    override fun insertCasts(casts: List<CastEntity>): Completable = castDao.insertCasts(casts)
    override fun getCasts(): Single<List<CastEntity>> = castDao.getAllCasts()
}