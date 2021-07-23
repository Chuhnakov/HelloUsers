package com.example.hellousers.data.common

import com.example.hellousers.data.retrofit.RetrofitClient
import com.example.hellousers.data.retrofit.RetrofitServices

object Common {
    private val BASE_URL = "https://reqres.in/api/"
    val retrofitService: RetrofitServices
        get() = RetrofitClient.getClient(BASE_URL).create(RetrofitServices::class.java)
}