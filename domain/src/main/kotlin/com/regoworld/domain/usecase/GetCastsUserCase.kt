package com.regoworld.domain.usecase

import com.regoworld.domain.repository.CastRepository
import javax.inject.Inject

class GetCastsUserCase @Inject constructor(
    private val repository: CastRepository
) {
}