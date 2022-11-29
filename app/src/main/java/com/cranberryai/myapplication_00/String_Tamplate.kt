package com.cranberryai.myapplication_00

fun main() {
    ex1_Tamplate("tamplate")

    // 여러 줄로 구성된 문자열 선언
    val students = """
        lee
        lim
        kim
        park
        son
    """
    println(students)

    // 리스트로 구성된 자료를 하나의 문자열로 표현하기
    val box = listOf("b", "o", "x", "!", "!")
    println(box.joinToString())
    println(box.joinToString("-"))

    class BoxName(val firstName: String, val lastName: String)
    val Box = listOf(BoxName("b","o"), BoxName("x","!"))
    println(Box.joinToString { "${it.firstName} ${it.lastName}" })
}

// input값을 직접 문자열에 대입
fun ex1_Tamplate(str : String) {
    println("문자열 대입 $str")
    println("문자열 대입 $str\n hashcode => ${str.hashCode()}")
}


fun ex2_Tamplate(str : String) {

}