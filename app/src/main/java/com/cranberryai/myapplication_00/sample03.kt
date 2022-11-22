package com.cranberryai.myapplication_00

// 1. lamda
// 람다식은 우리가 마치 value처럼 다룰 수 있는 익명함수
// 1) 메소드의 파라미터로 넘겨 줄수 있다 ex) fun maxBy(a : Int)
// 2) return 값으로 사용 가능

// 람다의 기본정의
// val lamdaName : Type = {argumentList -> codeBody}

// 한 곳에 타입을 선언해야 타입 추론 가능
val square : (Int) -> (Int) = {number -> number * number}
val nameAge : (String,Int) -> String = {name : String, age: Int -> "mu name is ${name} I'm ${age}"}

fun main() {
    println(square(12))
    println(nameAge("lkh", 29))
}