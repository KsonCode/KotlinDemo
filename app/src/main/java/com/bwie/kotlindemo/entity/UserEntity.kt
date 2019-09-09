package com.bwie.kotlindemo.entity

data class UserEntity(val message: String, val result: Result, val status: String) {
    data class Result(
        val age: Int,
        val email: String,
        val headPic: String,
        val height: Int,
        val id: Int,
        val invitationCode: String,
        val jiGuangPwd: String,
        val nickName: String,
        val sessionId: String,
        val sex: Int,
        val userName: String,
        val weight: Int,
        val whetherBingWeChat: Int
    )
}