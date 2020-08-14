package com.sk41.thatmovie.data.repository

enum class Status {
    RUNNING,
    SUCCESS,
    FAIL
}

class NetworkState(val status: Status, val msg: String) {

    companion object {

        lateinit var LOADED: NetworkState
        lateinit var LOADING: NetworkState
        lateinit var ERROR: NetworkState
    }

    init {

        LOADED = NetworkState(Status.SUCCESS, "Success")

        LOADING = NetworkState(Status.RUNNING, "Running")

        ERROR = NetworkState(Status.FAIL, "Something went wrong")
    }
}