package demo

fun main() {
    // 1. apply (configure and return receiver object)
    val person = Person1().apply {
        name = "Alice"
        age = 25
    }
    println("Person after apply: $person")

    // 2. also (perform additional actions, return receiver)
    val numbers = mutableListOf(1, 2, 3).also {
        println("Original numbers: $it")
        it.add(4)
    }
    println("Numbers after also: $numbers")

    // 3. let (operate on nullable, return last line, lambda argument is 'it')
    val name: String? = "Kotlin"
    name?.let {
        println("String is not null: $it")
    }

    // 4. with (work on object, return result of last line)
    val message = with(person) {
        "Name: $name, Age: $age"
    }
    println("With result: $message")

    // 5. run (execute block, return result of last line)
    val greeting = person.run {
        "Hello, my name is $name and I am $age"
    }
    println("Run result: $greeting")
}

// Supporting class for the demo
data class Person1(var name: String = "", var age: Int = 0)