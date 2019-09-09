package com.bwie.kotlindemo.model

import com.bwie.kotlindemo.api.LoginApiservice
import com.bwie.kotlindemo.contract.user.ILoginContract
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.functions.Consumer
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class LoginModel : ILoginContract.ILoginModel {

    override fun login(params: HashMap<String, String>, callback: ILoginContract.Callback) {


        var retrofit: Retrofit = Retrofit.Builder()
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        var loginApiservice: LoginApiservice = retrofit.create(LoginApiservice::class.java)

        loginApiservice.login(params).subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(Consumer {

                callback?.sucess(it)
            }, Consumer {

                callback?.failure(it.toString())
            })

    }
}