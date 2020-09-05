package com.example.kotlinsingletonexample.api

import com.example.kotlinsingletonexample.models.User
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService{
    @GET("placeholder/user/{userid}")
    suspend fun getUser(@Path("userid") userId:String):User
}