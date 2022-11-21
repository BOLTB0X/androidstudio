package com.cranberryai.myapplication_00

fun main() {
    println(HelloKotlin())
    println(add( 4, 5))

    //3. string Template
    val name = "kh"
    println("my name is $name") // 변수 출력 $

    println("my name is ${name}, i'm 29 old") // 변수 출력 {} 이용

    val firstname = "l"
    println("my name is ${name + firstname}, i'm 29 old") // 변수 출력 {} 이용

    // $을 출력하고 싶으면
    println("\$")

    forAndWhile()

}

// 1. 함수
fun HelloKotlin() {
    println("Hello Kotlin!!")
    println("Github Test!")
}

// 반환 값이 void가 아니면 : data type 붙어줘야함
fun add(a : Int, b: Int) : Int {
    return a + b
}

//2. val vs vaR
fun tmp() {
    // value, variable
    val a : Int = 10
    var b : Int = 9 // : 자동출원이기 때문에 Int 생략 가능
    // var e : string 이런식으로 꼭 할당할때만 생략 가능

    b = 100 // var 은 재할당 가능
    var name = "LKH"
}

//4. 조건식
fun maxBy(a: Int, b: Int) : Int {
    if (a > b) {
        return a
    }

    else {
        return b
    }
}

fun maxBy_short(a : Int, b : Int) = if (a > b) a else b

fun checkNum(score : Int) {
    // when은 리턴이 가능
    when(score) {
        0 -> println("0")
        1 -> println("1")
        2 -> println("2")
        3,4 -> println("3 or 4")
    }

    var b = when(score) {
        1 -> 1
        2 -> 2
        else -> 3
    }

    when(score) {
        in 90..100 -> println("good")
        else -> println("ㅠㅠ")
    }
}

// 5 Array and List
// list는 읽기만 가능
fun array() {
    val array1 = arrayOf(1,2,3)
    val list1 = listOf(1,2,3)

    val array2 = arrayOf(1,2,3, "d")
    val list2 = listOf(1,"4",3)

    //  배열은 변경 가능
    array1[0] = 5
    // 리스트는 불가

    var res = list1.get(0)

    val arrL = arrayListOf<Int>()
    arrL.add(10)
    arrL.add(20)
}

// 6. for / while

fun forAndWhile() {
    val students = arrayListOf<String>("jor", "kr", "fdf", "gogo")

    for (name in students) {
        println(name)
    }

    var sum = 0

    for (i in 1..100) {
        sum += i
    }
    println("1 $sum")

    sum = 0
    for (i in 1 until 100) {
        sum += i
    }
    println("2 $sum")

    sum = 0
    for (i in 1..100 step 2) {
        sum += i
    }
    println("3 $sum")

    sum = 0
    for (i in 10 downTo 1) {
        sum += i
    }
    println("4 $sum")

    var idx = 0
    while (idx < 10) {
        println("cur_idx: ${idx}")
        idx++
    }

    for ((index, name) in students.withIndex()) {
        println("${index + 1}번째 학생 : ${name}")
    }
}