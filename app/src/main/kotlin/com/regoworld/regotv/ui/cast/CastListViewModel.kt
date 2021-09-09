package com.regoworld.regotv.ui.cast

import androidx.lifecycle.ViewModel

class CastListViewModel : ViewModel() {

    init {
        fetchCasts()
    }

    private fun fetchCasts() {
//        val remonCast = RemonCast.builder().serviceId(ServiceConfig.remoteServerKey).key(ServiceConfig.secretKey).build()
//        remonCast.fetchCasts()
//        remonCast.onFetch { casts ->
//            Timber.d("casts: $casts")
//        }
    }
}