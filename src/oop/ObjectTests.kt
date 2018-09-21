package oop

import oop.classes.Car

fun main(args: Array<String>) {
    val car = Car("Green", "Honda")
    println(car.describe())
    val miniVan = Car("Gray", "Dodge", 7)
    println(miniVan.describe())
    car.pressGasPedal()
    car.pressGasPedal()
    car.pressBreakPedal()
    println(car.rpm)
}