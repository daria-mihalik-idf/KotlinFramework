package interfaces

import classObject.User

// 1. без реализации метода
/*
interface UserInfoProvider {
    fun printInfo(user: User)
}
 */

interface UserInfoProvider {
    //создание переменной в инт-се, нельзя добавить значение
    val info: String

    fun printInfo(user: User) {
        //println("method was called")
        println(info)
        user.printUser()
    }
}
