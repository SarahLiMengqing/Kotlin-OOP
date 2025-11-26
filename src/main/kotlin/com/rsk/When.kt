package com.rsk

enum class Color {
    RED,BLUE,YELLOW,WHITE
}

fun main() {
    val color = Color.BLUE
    when (color) {
        Color.BLUE -> println("Blue")
        Color.RED -> println("Red")
        Color.YELLOW -> println("Yellow")
        Color.WHITE -> println("WHITE")
        else -> println("Unknown")
    }
    /*val someBool = false
    when(someBool) {
        true -> println("true")
        else -> println("false")
    }*/
    /*val num = 2
    val validNumbers: IntRange = 1 .. 5
    when (num) {
        !in validNumbers -> println("num is valid")
        in 1 .. 10 -> println("num is in the range")
        else -> println("num is outside the range")
    }*/
    /*val num = 6
    val isNumEqualSix: Boolean = when (num) {
        6 -> true
        else -> false
    }
    println(isNumEqualSix)*/
}