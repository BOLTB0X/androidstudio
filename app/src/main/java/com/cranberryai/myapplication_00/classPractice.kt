package com.cranberryai.myapplication_00

open class human constructor(val name : String = "fwfefrcefcvrewfvewr"){

    constructor(name: String, age : Int): this(name) {
        println("my name is ${name}, ${age}years old")
    }
    init {
        println("주요 생성자 일부로 코드 블럭이 돈다")
    }
    open fun eatingCake() {
        println("This is so ymmmmmmmmmmmmmmmmmmmmmmm")
    }

}

// 상속
class Kor : human() {
    override fun eatingCake() {
        println("오바리이딩 후")
    }
}

fun main() {
    val hm = human("sfdcdwsfe")

    val hm2 = human()
    hm.eatingCake()

    val hm3 = human("fsfwdf", 42)

    println("ny name is ${hm.name}")
    println("ny name is ${hm2.name}")

    val koreans = Kor()
    koreans.eatingCake()
}