package scopeFunction

fun main() {
    val bob = FinctionalPerson(
            firstName = "Bob",
            lastName = "Marley",
            age = 30,
            address = Address(
                    number = 25,
                    street = "Levkova",
                    city = "Minsk",
                    state = "Minskk",
                    zipCode = 985206
            )
    )
    println(bob)

    val returned = bob.apply {
        address.city = "Brest"
        address.zipCode = 102569
        println("Bob Has Moved To Brest")
        gender = "Male"
        hasFacebook = true
        hasVK = false
        println("Optional Venues Have Been Applied")
    }
    println(bob)
    println(returned)
}