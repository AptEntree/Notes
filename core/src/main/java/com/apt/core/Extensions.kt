package com.apt.core

import android.util.Log

fun Any.logD(message: String) {
    if (BuildConfig.DEBUG) Log.d(this::class.java.simpleName, message)
}

fun Any.logI(message: String) {
    if (BuildConfig.DEBUG) Log.i(this::class.java.simpleName, message)
}

fun Any.logE(message: String) {
    Log.e(this::class.java.simpleName, message)
}