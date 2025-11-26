package demo

fun main() {
    // 1. List (ordered, allows duplicates)
    val fruits: List<String> = listOf("apple", "banana", "apple", "orange")
    println("Fruits List:")
    fruits.forEach { println(it) }
    println("Second fruit: ${fruits[1]}") // Access by index

    // 2. Set (unordered, unique elements)
    val fruitSet: Set<String> = setOf("apple", "banana", "apple", "orange")
    println("\nFruit Set:")
    fruitSet.forEach { println(it) } // No duplicates, order not guaranteed

    // 3. ArrayDeque (double-ended queue, efficient adding/removing at both ends)
    val queue: ArrayDeque<String> = ArrayDeque()
    queue.add("first")
    queue.addLast("second")
    queue.addFirst("zero")
    println("\nArrayDeque contents:")
    queue.forEach { println(it) }

    // Remove elements from both ends
    val removedFirst = queue.removeFirst()
    val removedLast = queue.removeLast()
    println("\nRemoved from front: $removedFirst")
    println("Removed from end: $removedLast")

    // Remaining elements
    println("\nArrayDeque after removals:")
    queue.forEach { println(it) }
}