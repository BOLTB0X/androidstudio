package com.cranberryai.myapplication_00

// Java의 스태틱 역할
class Book private constructor(val id: Int, val name : String) {
    companion object BookFactory {
         fun getID() : Int {
            return 444
        }

        val name = "new book"
        fun create() = Book(0, name)
    }
}

interface IdProvider {
    fun getId() : Int
}

fun main() {
    val book = Book.create()

    println("${book.id} ${book.name}")
}