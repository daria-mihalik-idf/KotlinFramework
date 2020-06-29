package interfaces

import classObject.User

enum class Animals {
    DOG, CAT, BEAR, LION;

    fun toLowerCase() = name.toLowerCase().capitalize()
}

fun main(args: Array<String>) {
    //val user = MainProvider()
    val user = object : MainProvider() {
        override fun printInfo(user: User) {
            super.printInfo(user)
            println("Выводится текст из класса-наследника")
        }
    }
    //val user =  NewClass()
    //user.printInfo(User())
    //println(user.getConnection())

    checkDataTypes(user)

    val animal = Animals.CAT

    when (animal) {
        Animals.CAT -> println("Кошка")
        Animals.BEAR -> println(animal.toLowerCase())
        else -> println("другое")
    }
}

fun checkDataTypes(obj: MainProvider) {
    if (obj is UserInfoProvider) {
        obj.printInfo(User())
    }
    if (obj is DbConnection) {
        println(obj.getConnection())
    }
}