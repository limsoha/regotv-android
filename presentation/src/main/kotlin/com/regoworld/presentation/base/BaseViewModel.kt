package com.regoworld.presentation.base

import android.content.DialogInterface
import androidx.annotation.StringRes
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.regoworld.presentation.core.Event
import io.reactivex.rxjava3.disposables.CompositeDisposable

open class BaseViewModel : ViewModel() {

    protected val disposables = CompositeDisposable()

    protected val _isRefreshing = MutableLiveData<Boolean>()
    val isRefreshing: LiveData<Boolean> = _isRefreshing

    protected val _isLoading = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean> = _isLoading

    protected val _snackbarText = MutableLiveData<Event<Int>>()
    val snackbarText: LiveData<Event<Int>> = _snackbarText

    protected val _dialogEventStringRes = MutableLiveData<Event<Int>>()
    val dialogEventStringRes: LiveData<Event<Int>> = _dialogEventStringRes

    protected val _dialogEvent = MutableLiveData<Event<Dialog>>()
    val dialogEvent: LiveData<Event<Dialog>> = _dialogEvent

    protected fun showSnackbarMessage(@StringRes message: Int) {
        _snackbarText.value = Event(message)
    }

    protected fun showDialog(@StringRes message: Int) {
        _dialogEventStringRes.value = Event(message)
    }

    protected fun showDialog(message: String, clickPositive: DialogInterface.OnClickListener? = null, clickNegative: DialogInterface.OnClickListener? = null, cancelable: Boolean = true) {
        _dialogEvent.value = Event(Dialog(message, clickPositive, clickNegative, cancelable))
    }

    data class Dialog(val message: String, val clickPositive: DialogInterface.OnClickListener?, val clickNegative: DialogInterface.OnClickListener?, val cancelable: Boolean)

    override fun onCleared() {
        super.onCleared()

        disposables.clear()
    }
}