package com.bwie.kotlindemo.api

import com.bwie.kotlindemo.entity.UserEntity
import io.reactivex.Observable
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface LoginApiservice {


    @POST("health/user/v1/login")
    @FormUrlEncoded
    fun login(parmas:HashMap<String,String>):Observable<UserEntity>
}