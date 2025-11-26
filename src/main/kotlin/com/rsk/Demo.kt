package com.rsk

fun main(args: Array<String>) {
    val a = 23
    val b = 10

    /*var min: Int = a
    if (a < b)
        min = a
    else
        min = b
    println(min)*/

    /*val min = if (a < b) a else b
    println(min)*/

    val min: Int = if (a < b) {
        println("return a")
        a
    } else {
        println("return b")
        b
    }
    println(min)


    /*for (a: String in args) {
        print(a)
    }
    println()

    var value:Int = sum(23, 42)
    println(value)

    value = sum2(26, 47)
    println(value)

    doNothing()

    val count : Int
    // println(count) // Variable 'count' must be initialized.
    count = 13
    println(count)

    var count2 : Int = 14
    count2 = 15
    println(count2)*/
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int) = a + b

fun doNothing() : Unit {
    println("Called doNothing")
}