package com.bwie.kotlindemo.presenter

import com.bwie.kotlindemo.contract.user.ILoginContract
import com.bwie.kotlindemo.entity.UserEntity
import com.bwie.kotlindemo.model.LoginModel

class LoginPrestenter:ILoginContract.ILoginPrestenter {

//    private var model:LoginModel? = null
    private lateinit var model:LoginModel
    private lateinit var view:ILoginContract.ILoginView

    fun LoginPrestenter(iLoginView: ILoginContract.ILoginView){
        this.view = iLoginView
        model = LoginModel()
    }
    override fun login(params: HashMap<String, String>) {

        model.run {
            login(params,object :ILoginContract.Callback{
                override fun sucess(userEntity: UserEntity) {
                    view.success(userEntity)
                }

                override fun failure(msg: String) {
                    view.failure(msg)
                }

            })
        }

    }
}