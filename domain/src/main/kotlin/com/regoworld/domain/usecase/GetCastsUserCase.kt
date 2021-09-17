package com.regoworld.domain.usecase

import com.regoworld.domain.repository.CastRepository
import com.remotemonster.sdk.data.Room
import io.reactivex.rxjava3.core.Flowable
import javax.inject.Inject

// 방송목록 가져오기 (Local + Remote)
class GetCastsUserCase @Inject constructor(
    private val repository: CastRepository
) {
    fun execute() : Flowable<List<Room>> = repository.getCasts()
}