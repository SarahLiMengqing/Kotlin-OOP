package com.rsk


/*data class Person(val name: String) {
    var age: Int = 0

    override fun toString(): String {
        return "Person(name='$name', age=$age)"
    }
}

fun main() {
    val sam = Person("Sam")
    sam.age = 35
    val sam2 = Person("Sam")
    sam2.age = 55

    println("Person has hashCode: ${sam.hashCode()}")
    println("Person2 has hashCode: ${sam2.hashCode()}")
    println("Person is ${sam.toString()}")
}*/


data class Person(val name: String, val age: Int)

fun main() {
    /*val sam = Person("Sam", 35)
    val sam2 = sam.copy(age = 55)

    println("$sam, has hash code ${sam.hashCode()}")
    println("$sam2, has hash code ${sam2.hashCode()}")

    val (name: String, age: Int) = sam2
    println("name: $name, age: $age")

    println("Sam has the ${sam.name} age of ${sam.age}")
    println("Sam2 has the ${sam2.name} age of ${sam2.age}")*/


    val sam = Person("Sam", 35)
    val sam2 = Person("Sam", 35)
/*    println("Person is $sam")
    println("Person has hashCode: ${sam.hashCode()}")
    println("Person has hashCode: ${sam2.hashCode()}")*/

    if (sam.equals(sam2)) {
        println("They are the same")
    } else {
        println("They are different")
    }

    if (sam == sam2) {
        println("They are the same")
    } else {
        println("They are different")
    }

    if (sam === sam2) {
        println("They are the same")
    } else {
        println("They are different")
    }
}
