package com.apt.core.model

sealed class Response<out T> {
    data class Success<out T>(val data: T) : Response<T>()
    data class Error(val exception: Exception) : Response<Nothing>()
    data object Loading : Response<Nothing>()
}