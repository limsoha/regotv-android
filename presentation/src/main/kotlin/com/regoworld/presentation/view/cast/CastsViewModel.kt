package com.regoworld.presentation.view.cast

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.remotemonster.sdk.RemonCast
import com.remotemonster.sdk.data.Room
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
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
        viewModelScope.launch {

            remonCast.fetchCasts()
            remonCast.onFetch { casts ->
                Timber.d("casts:$casts")
                _casts.value = casts
            }
        }
    }
}