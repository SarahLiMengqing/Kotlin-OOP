package com.rsk

@JvmInline
value class Score(val score: Int) {
    init {
        if (score !in 0..100) {
            throw IllegalArgumentException("Score must be between 0 and 100")
        }
    }
}

class Exam {
    fun score(name: String, studentScore: Score) {
        /*if (studentScore < 0 || studentScore > 100) {
            throw IllegalArgumentException("Student score must be between 0 and 100")
        }*/
    }

    fun amendScore(id: Int, newScore: Score) {
        /*if (newScore < 0 || newScore > 100) {
            throw IllegalArgumentException("New score must be between 0 and 100")
        }*/
    }
}

fun main() {

   /* println("Started")
    val earth = Planet("Earth", 12, false, false)
    println("Earth created: ${earth.name} - ${earth.diameter} - ${earth.radius} - ${earth.population}")
    earth.population = 800000
    println("Earth created: ${earth.name} - ${earth.diameter} - ${earth.radius} - ${earth.population}")

    val newPopulation = earth.runPopulationModel(0, 0, 10000000)
    println("New population: $newPopulation")*/


    /*val name = "Kotlin"
    println("Name: $name")
    println("Name uppercase: ${name.uppercase()}")*/
}