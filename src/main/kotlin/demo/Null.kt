fun main() {
    // Nullable type: the '?' means 'name' can be null
    val name: String? = null

    // 1. Safe call operator (?.)
    println(name?.length) // Output: null (doesn't throw NullPointerException)

    // 2. Elvis operator (?:) — provides default if null
    val lengthOrZero = name?.length ?: 0
    println("Length (or zero): $lengthOrZero") // Output: Length (or zero): 0

    // 3. Non-null assertion (!!) — throws if null (discouraged in production)
    // println(name!!.length) // Uncomment to see NullPointerException

    // 4. Safe use with 'let'
    val maybeMessage: String? = "Hello Kotlin"
    maybeMessage?.let {
        println("Uppercase: ${it.uppercase()}") // Prints Uppercase: HELLO KOTLIN
    }

    // 5. Combining null safety in a function
    fun greet(userName: String?) {
        println("Hello, ${userName ?: "stranger"}!") // Output: Hello, stranger!
    }
    greet(name) // name is null
    greet("Sarah")
}