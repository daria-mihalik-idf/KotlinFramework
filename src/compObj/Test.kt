package compObj

class Test {
    // аналог статики в java
    companion object {
        var count = 0
    }

    init {
        count++
        println("Создано объектов: $count")
    }
}

fun main(args: Array<String>) {
    val test = Test()
    val test2 = Test()
    val test3 = Test()
    val test4 = Test()

    //Test.count = 5

}