package com.cranberryai.myapplication_00

data class Ticket(val companyName : String, val name : String, var data : String,var seatNumber : Int)
data class TicketNomal(val companyName : String, val name : String, var data : String,var seatNumber : Int)

// toString(), hashCode(), equals(), copy()

fun main() {
    val ticketA = Ticket("hahaha", "lkh", "2022-11-22", 14)
    val ticketB = TicketNomal("hahaha", "lkh", "2022-11-22", 14)

    println(ticketA)
    println(ticketB)
}