package model

interface IUser {

    val userName:String
    val password:String
    fun loginValidateCode():Int
}