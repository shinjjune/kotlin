package com.example.myapplication.Kotlin

// 02. 자료형
// 정수형 -> Long > Int > Short > Byte
// 실수형 -> Double > Float
// 문자 -> Char
// 문자열 -> String
// 논리형(True/False) -> Boolean

// 변수 선언하는 방법(2)
// var/val 변수 : 자료형 = 값

var number = 10
var number1 : Int = 20
var hello1 : String = "Hello"
var point1: Double = 3.4

// var or val?? --> 변하지 않는 값이면 : Value/ 진짜 모르겠다 : Value

fun main(array:Array<String>){
    number = 20
    println(number1+ number)
}
