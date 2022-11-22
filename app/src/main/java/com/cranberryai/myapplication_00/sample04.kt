package com.cranberryai.myapplication_00

// 확장함수
val pizzaIsGreat : String.() -> String = {
    this + "Pizza is goood"
}

fun extendString(name : String, age : Int) : String {
    // this가 가르키는 것은 확장함수 Nyself
    // it은 Int
    val Myself : String.(Int) -> String = {"I'm ${this} and ${it} years old"}
    return name.Myself(age)
}

// 람다의 return
val calculateGrade : (Int) -> String = {
    when(it) {
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfet"
        else -> "Error"
    }
}

fun main() {
    val a = "kh said "
    val b = "terry said "

    // 확장
    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())
    println(extendString("fff", 23))

    // 람다
    println(calculateGrade(45))

    val lamda = {number : Double ->
        number == 4.3213
    }

    println(invokeLamda(lamda))
    println(invokeLamda({it > 3.22}))

    // 람다식의 특싱
    // 생략 가능
    invokeLamda { it > 3.22 }
}

// 람다를 표현하는 여러가지 방법
fun invokeLamda(lamda : (Double) -> Boolean) : Boolean {
    return lamda(5.2343)
}


