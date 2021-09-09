package com.regoworld.regotv

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.regoworld.regotv.ui.cast.CastListViewModel

/**
 * Factory for all ViewModels.
 */
@Suppress("UNCHECKED_CAST")
class ViewModelFactory constructor() :
        ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel> create(modelClass: Class<T>) =
            with(modelClass) {
                when {
                    isAssignableFrom(CastListViewModel::class.java) ->
                        CastListViewModel()
                    else ->
                        throw IllegalArgumentException("Unknown ViewModel class: ${modelClass.name}")
                }
            } as T
}