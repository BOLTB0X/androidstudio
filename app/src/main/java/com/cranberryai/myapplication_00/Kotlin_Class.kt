package com.cranberryai.myapplication_00

// 기본 가시성이 public
// 일반 Java와 비슷하게 선언
class java_Class {
    // 코틀린의 클래스 생성자
    constructor(name:String, age:Int) {
        this.name = name
        this.age = age
    }

    // 클래스의 프로퍼티 선언
    var name: String = ""
    var age : Int = 0
}

// real 코틀린 스타일
class real_Class(var name:String = "Oh", var age: Int = 27)

fun main() {
    // 클래스 생성자 오버로드(overload)
    val JC1 = java_Class("Lee", 20)
    val JC2 = java_Class("Kim", 29)
    println("${JC1.name} ${JC1.age}")
    println("${JC2.name} ${JC2.age}")

    val KC0 = real_Class()
    val KC1 = java_Class("Park", 25)
    val KC2 = java_Class("Lim", 39)
    println("${KC0.name} ${KC0.age}")
    println("${KC1.name} ${KC1.age}")
    println("${KC2.name} ${KC2.age}")
}