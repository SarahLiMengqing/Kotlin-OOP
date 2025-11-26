package demo

// Simple class definition
class Person(val name: String, var age: Int) {

    // Method in a class
    fun sayHello() {
        println("Hello, my name is $name and I am $age years old.")
    }
}

// Interface definition
interface Greeter {
    fun greet()
}

// People class implementing an interface
class People(val name: String, var age: Int) : Greeter {
    override fun greet() {
        println("Hello, my name is $name and I am $age years old.")
    }
}

// Inheritance
open class Animal(val species: String) {
    open fun makeSound() {
        println("Some generic animal sound")
    }
}

class Dog : Animal("Dog") {
    override fun makeSound() {
        println("Woof!")
    }
}

fun main() {
    // Create an instance of Person
    val person = Person("Alice", 28)
    person.sayHello() // Class method

    val people = People("Sam", 18)
    people.greet() // Interface method

    // Create an instance of Animal
    val genericAnimal = Animal("Unknown")
    genericAnimal.makeSound() // Inheritance method

    // Create an instance of Dog
    val dog = Dog()
    dog.makeSound() // Inheritance method
}

/*
Companion objects
// Class with a primary constructor that declares the name property
class Person(
    val name: String
) {
    // Class body with a companion object
    companion object {
        fun createAnonymous() = Person("Anonymous")
    }
}

fun main() {
    // Calls the function without creating an instance of the class
    val anonymous = Person.createAnonymous()
    println(anonymous.name)
    // Anonymous
}
*/

/*
// Data class definition
data class User(val id: Int, val name: String, val email: String)

fun main() {
    // Create instances of data class
    val user1 = User(1, "Alice", "alice@example.com")
    val user2 = User(2, "Bob", "bob@example.com")

    // Use auto-generated copy() method
    val user3 = user1.copy(name = "Charlie")

    // Use auto-generated toString() method
    println(user1)  // Output: User(id=1, name=Alice, email=alice@example.com)

    // Use auto-generated equals() method
    println(user1 == user3)  // Output: false

    // Use destructuring
    val (id, name, email) = user2
    println("Id: $id, Name: $name, Email: $email")

    // List of users
    val users = listOf(user1, user2, user3)
    users.forEach { println(it) }
}
 */