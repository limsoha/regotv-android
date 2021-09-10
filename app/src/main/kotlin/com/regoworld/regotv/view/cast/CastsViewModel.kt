package com.regoworld.regotv.view.cast

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.remotemonster.sdk.RemonCast
import com.remotemonster.sdk.data.Room
import dagger.hilt.android.lifecycle.HiltViewModel
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class CastsViewModel @Inject constructor(private val remonCast: RemonCast) : ViewModel() {

    /***** LiveData *****/
    private val _casts = MutableLiveData<List<Room>>()
    val casts: LiveData<List<Room>> = _casts

    init {
        fetchCasts()
    }


    private fun fetchCasts() {
        remonCast.fetchCasts()
        remonCast.onFetch { casts ->
            Timber.d("casts:$casts")
            _casts.value = casts
        }
    }
}