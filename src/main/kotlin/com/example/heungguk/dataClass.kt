package com.example.heungguk

//Data Class
// 몇개던 여기에 만들 수 있음.

data class Ticket(val companyName : String, val name : String, var date : String, var seatNumber : Int)
// toString(), hashCode(), equals(), copy()

class TicketNormal(val companyName : String, val name : String, var date : String, var seatNumber : Int)

fun main(){
    val ticketA = Ticket("koreanAir", "wonjunLee", "2022-08-31", 14)
    val ticketB = TicketNormal("koreanAir", "wonjunLee", "2022-08-31", 14)

    println(ticketA)
    println(ticketB)

}


data class KotlinData(var s: String, var i: Int, var isB: Boolean)

val data1 = KotlinData("hi", 1, false)