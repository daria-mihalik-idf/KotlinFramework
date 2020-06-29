package compObj

sealed  class Db {
    data class MySQL(val id: Int, val conn: String) : Db()  //тип как название изолированного класса
    data class MongoDB(val id: Int, val conn: String) : Db(){
        /*
        fun Db.MongoDB.printInfo() {
            println(info)
        }

         */

    }
    data class PostgreSQL(val id: Int, val conn: String, val isDone: Boolean) : Db()

    object HelpToUser: Db(){
        val conn = "Connection is done"
    }

}

//функция вне класса, но принадлежит классу
fun Db.MongoDB.printInfo() {
    println(info)
}

//переменная вне класса через функцию get
val Db.MongoDB.info: String
get() = "MongoDB has id: $id and connection: $conn"

//создание функции, принимающей  в качестве параметра другую функцию
