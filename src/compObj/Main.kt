package compObj

class Main {
}

fun main(args: Array<String>) {
    //создание объекта изолированного класса
    val db = Db.MongoDB(5, "mongo")
    val db2 = Db.MySQL(6, "MySQL")

    val db_copy = db.copy(conn = "Done")
    if (db==db_copy)
        println("Они равны")
    else
        println("Они не равны")

//проверка, что объект создан на основе класса MongoDB
    if (db is Db.MongoDB){
        db.printInfo()
        //db_copy.printInfo()
    }

}