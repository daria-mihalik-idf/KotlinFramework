package scopeFunction

data class FinctionalPerson(
        var firstName: String,
        var lastName: String,
        var age: Int,
        var address: Address,
        var gender: String? = null,
        var occupation: String? = null,
        var hasFacebook: Boolean = false,
        var hasVK: Boolean = false
)

data class Address(
        var number: Int,
        var street: String,
        var city: String,
        var state: String,
        var zipCode: Int
)

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

    bob.address.let {
        it.state = "tttt"
        it.zipCode = 258941
    }
    println(bob)


    var ann: FinctionalPerson? = FinctionalPerson(
            firstName = "Ann",
            lastName = "Marley",
            age = 25,
            address = Address(
                    number = 25,
                    street = "Levkova",
                    city = "Minsk",
                    state = "Minskk",
                    zipCode = 985206
            )
    )
    println(ann)

    //ann = null

    ann?.address = bob.address
    ann?.let { person ->
        person.address = bob.address
        person.gender = "Female"
        person.hasFacebook = true
        person.hasVK = false
    } ?:  println("ann is actually null,isn't that bad?")
    println(ann)
}