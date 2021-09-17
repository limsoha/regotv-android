package com.regoworld.domain.repository

import com.remotemonster.sdk.data.Room
import io.reactivex.rxjava3.core.Flowable
import io.reactivex.rxjava3.core.Single

interface CastRepository {

    fun getCasts() : Flowable<List<Room>>

    fun getLocalCasts() : Flowable<List<Room>>

    fun getRemoteCasts() : Single<List<Room>>
}