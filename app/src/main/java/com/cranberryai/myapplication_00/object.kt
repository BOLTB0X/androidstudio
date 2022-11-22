package com.cranberryai.myapplication_00

object CarFactory {
    var cars = mutableListOf<Car>()

    fun makeCar(horse: Int) : Car {
        val car = Car(horse)
        cars.add(car)
        return car
    }
}

data class Car(val horse : Int)

fun main() {
    val car1 = CarFactory.makeCar(10)
    val car2 = CarFactory.makeCar(30)

    println(car1)
    println(car2)
    println(CarFactory.cars.size.toString())
}