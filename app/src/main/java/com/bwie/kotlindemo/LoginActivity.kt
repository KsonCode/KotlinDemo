package com.bwie.kotlindemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.bwie.kotlindemo.api.LoginApiservice
import com.bwie.kotlindemo.entity.UserEntity
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.functions.Consumer
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_login.*
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class LoginActivity : AppCompatActivity() ,View.OnClickListener{




    override fun onClick(v: View?) {
        when(v!!.id){
             R.id.login->{
                 requestLogin(et_phone.text.toString(),"1")
             }
        }
    }

    /**
     * 登录方法
     */
    private fun requestLogin(phone:String,pwd:String) {

//
//        var retrofit:Retrofit = Retrofit.Builder()
//            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//
//        var loginApiservice:LoginApiservice = retrofit.create(LoginApiservice::class.java)
//
////        loginApiservice.login(phone,pwd).subscribeOn(Schedulers.io())
////        .observeOn(AndroidSchedulers.mainThread())
////            .subscribe(Consumer {
////                var userEntity = it
////            }, Consumer {
////                println(it)
////            })
//
//        loginApiservice.login(phone,pwd).subscribeOn(Schedulers.io())
//            .observeOn(AndroidSchedulers.mainThread())
//            .subscribe(Consumer<UserEntity> {
//                println("userentity==="+it.message)
//            },object :Consumer<Throwable>{
//                override fun accept(t: Throwable?) {
//                }
//
//            })


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
}
