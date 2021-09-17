package com.regoworld.domain.core

import android.util.Log
import timber.log.Timber

// https://www.androidhive.info/2018/11/android-implementing-logging-using-timber/
// Release 시 로그 제거
class ReleaseTree : Timber.Tree() {

    override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
        if (priority == Log.VERBOSE || priority == Log.DEBUG) {
            return
        }
    }
}