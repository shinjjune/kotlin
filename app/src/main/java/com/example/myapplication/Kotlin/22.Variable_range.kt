package com.example.myapplication.Kotlin

// 변수의 접근 범위
// 전역변수
// 지역 변수



var number100 : Int =10

fun main(args: Array<String>){
    println(number100)
    val test = Test("홍길동")
    test.testFun()
    test.name
    println(number100)
}

class Test(var name: String){

    fun testFun(){
        var birth:String ="2000/3/1"
        name = "홍길동"
        number100 = 100
        println(birth)

        fun testFun3() {
            var gender: String = "male"
            println(gender)
        }
            testFun3()
    }
    fun testFun2() {

    }
}