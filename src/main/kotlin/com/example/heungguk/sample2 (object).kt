package com.example.heungguk

//Singleton Pattern - 앱에서 처음컴파일될때 CarFactory라는 객체를 딱 한번만 생성하고 더이상 생성안함. 메모리 절감
object CarFactory {
    val cars = mutableListOf<Car>()
    fun makeCar(horsePower: Int) : Car {
        val car = Car(horsePower)
        cars.add(car)
        return car
    }
}

data class Car(val horsePower : Int)

fun main() {
    val car = CarFactory.makeCar(10)
    val car2 = CarFactory.makeCar(200)

    println(car)
    println(car2)
    println(CarFactory.cars.size.toString())

}