package com.nehank.networking

sealed class ApiResult<out T> {
    data class Success<out T>(val data : T) : ApiResult<T>()
    data class Error(val code: Int, val errorMessage: String) : ApiResult<Nothing>()
    data class Exception(val throwable: Throwable): ApiResult<Nothing>()
    data class Loading(val loadingStatus: Boolean): ApiResult<Nothing>()
}