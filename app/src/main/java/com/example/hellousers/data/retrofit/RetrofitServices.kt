package com.example.hellousers.data.retrofit

import com.example.hellousers.data.model.User
import io.reactivex.Observable
import retrofit2.Call
import  retrofit2.http.*


interface RetrofitServices {
    //@GET("users")
    //suspend fun getUsers(): List<User>
    @GET("users")
    suspend fun getUsers(): Observable<MutableList<User>>
}