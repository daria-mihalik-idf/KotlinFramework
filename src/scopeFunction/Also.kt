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
    ).also { person ->
        insert(person)
    }
    //.also{ insert(it) }

    println(bob)
}

fun insert(finctionalPerson: FinctionalPerson) {
    println("Inserted $finctionalPerson into the database.")
}