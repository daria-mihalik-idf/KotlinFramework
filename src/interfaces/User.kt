package interfaces

class User(var firstname: String = "Pit", var lastName: String = "Pieter") {
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

    fun printUser() {
        println("$firstname $lastName")
    }
}
