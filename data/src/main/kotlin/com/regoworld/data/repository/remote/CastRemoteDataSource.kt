package com.regoworld.data.repository.remote

import com.remotemonster.sdk.data.Room
import io.reactivex.rxjava3.core.Single

interface CastRemoteDataSource {
    fun getCasts(): Single<List<Room>>
}