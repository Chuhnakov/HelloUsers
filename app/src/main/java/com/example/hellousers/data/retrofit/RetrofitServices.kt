package com.example.hellousers.data.retrofit

import com.example.hellousers.data.model.User
import retrofit2.Call
import retrofit2.http.GET


interface RetrofitServices {
    @GET("users")
    suspend fun getUsers(): List<User>
}