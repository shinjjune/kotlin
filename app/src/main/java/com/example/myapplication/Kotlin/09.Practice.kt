package com.example.myapplication.Kotlin

fun main(args:Array<String>) {

    val a:Int? = null
    val b:Int = 10
    val c:Int = 100

    if (a == null) {
        println("a is null")
    } else {
        println("a is not null")
    }

    if (b + c == 110) {
        println("OK")
    } else {
        println("fuck")
    }

//    엘비스 연산자
    val number: Int? = 1250125
    val number2 = number ?: 10
    println()
    println(number2)

    val num1: Int = 101
    val num2: Int = 202

    val max = if (num1<num2) {
        num1
    } else if (num1 == num2) {
        num2
    } else {
        println("fuck")
    }
    println(max)


}