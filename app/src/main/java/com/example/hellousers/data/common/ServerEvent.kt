package com.example.hellousers.data.common


import android.util.EventLog
import java.lang.Error

data class ServerEvent<out T>(val status: Status, val data: T?, val error: Error?) {

    companion object {
        fun <T> loading(): ServerEvent<T>{
            return ServerEvent(Status.LOADING, null, null)
        }
        fun <T> success(data: T?): ServerEvent<T>{
            return ServerEvent(Status.SUCCESS,data,null)
        }
        fun <T> error(error: Error?): ServerEvent<T>{
            return ServerEvent(Status.ERROR,null,error)
        }
    }
}

enum class Status {
    SUCCESS,
    ERROR,
    LOADING
}