package interfaces

import classObject.User

//1. используем интерфейс без реализации
/*
class MainProvider : UserInfoProvider {
   override fun printInfo(user: User) {
       println("method was called")
       }
   }

 */

//несколько интерфейсов в одном классе
open class MainProvider : UserInfoProvider, DbConnection {
    protected open val db = "DB connected"

    override val info: String
        get() = "method was called"

    override fun printInfo(user: User) {
        super.printInfo(user)
        println("дополнительный код")
    }

    override fun getConnection(): String {
        return db
    }
}
