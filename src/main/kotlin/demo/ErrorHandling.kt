package demo

// Custom exception class
class InvalidAgeException(message: String) : Exception(message)

fun parseAge(input: String): Int {
    return try {
        val age = input.toInt()
        if (age < 0) throw InvalidAgeException("Age cannot be negative: $age")
        age
    } catch (e: NumberFormatException) {
        println("Error: Invalid number format - ${e.message}")
        -1
    } catch (e: InvalidAgeException) {
        println("Error: ${e.message}")
        -1
    } finally {
        println("parseAge called with input: $input")
    }
}

fun main() {
    val valid = parseAge("25")       // Output: 25
    val invalidNum = parseAge("abc") // Output: -1
    val negative = parseAge("-10")   // Output: -1

    println("Valid age: $valid")
    println("Invalid age: $invalidNum")
    println("Negative age: $negative")
}