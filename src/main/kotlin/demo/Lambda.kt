package demo

fun main() {
    // 1. Basic lambda expression assigned to a variable
    val add = { x: Int, y: Int -> x + y }
    println("Sum: ${add(3, 5)}") // Output: Sum: 8

    // 2. Lambda as function parameter
    fun operateOnNumbers(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
        return operation(a, b)
    }
    val result = operateOnNumbers(10, 20, { x, y -> x * y })
    println("Multiplication result: $result") // Output: Multiplication result: 200

    // 3. Lambda with collections
    val numbers = listOf(1, 2, 3, 4, 5)
    println("Even numbers:")
    numbers.filter { it % 2 == 0 }.forEach { println(it) }
    
    // 4. Lambda with implicit 'it'
    val doubled = numbers.map { it * 2 }
    println("Doubled: $doubled") // Output: Doubled: [2, 4, 6, 8, 10]

    // 5. Trailing lambda syntax
    val greeting = operateOnNumbers(7, 8) { a, b ->
        a * b
    }
    println("7 * 8 = $greeting")
}