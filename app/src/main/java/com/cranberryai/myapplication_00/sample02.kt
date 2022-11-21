package com.cranberryai.myapplication_00

fun main() {
    nullcheck()
    println(igonoreNulls("esfrdsfgs"))
}

// 7 nullable / NonNuLL
fun nullcheck() {
    // NPE : NULL pointer Exception
    var name = "lkh"
    // ? 붙여야 함
    var nullName : String? = null

    var nameInUpperCase = name.toUpperCase()
    var nullnameInUpperCase = nullName?.toUpperCase()

    // ?:
    val lastName = "gsa"
    //val lastName : String? = null

    val fullName = name + " " + (lastName?: "No lastName")

    println(fullName)
}

fun igonoreNulls(str : String?) {
    val mNotNull : String = str!!
    val upp = mNotNull.toUpperCase()

    val email : String? = "nadwsrd2r2@naver.com"
    email?.let{
        println("email is ${email}")
    }
}