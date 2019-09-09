package com.bwie.kotlindemo.contract.user

import com.bwie.kotlindemo.entity.UserEntity
import javax.security.auth.callback.Callback

interface ILoginContract {

    interface ILoginView{

        fun success(userEntity: UserEntity)
        fun failure(msg:String)

    }
    interface ILoginModel{

        fun login(params:HashMap<String,String>,callback: Callback)

    }interface ILoginPrestenter{

        fun login(params:HashMap<String,String>)

    }

    interface Callback{
        fun sucess(userEntity: UserEntity)
        fun failure(msg:String)
    }
}