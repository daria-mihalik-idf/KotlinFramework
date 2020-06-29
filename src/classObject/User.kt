package classObject

// реализация без сползьования contructor()
class User(var firstname: String = "Pit", var lastName: String = "Pieter") {
    // class User (var firstname: String , var  lastName: String )

    /*
     var firstname: String = "Dasha"
     var lastname: String = "Mikhalik"

     fun printUser(){
         println("$firstname $lastname")
     }
     */

    /*
    constructor(): this("Pit", "Pieter"){
    println("Данные были установлены")
    }
     */

    //4  null safe, set/get
    var login: String? = null
        set(value) {
            if (value == "dariam")
                field = "None"
            else
                field = value
            println("Значение переменной: $field")
        }
        get() {
            //5
            val loginField = field ?: "неизвестно"
            println("Переменная равна: $loginField")
            //println("Переменная равна: $field")
            return field
        }

    internal fun printUser() {
        println("$firstname $lastName")
    }

}