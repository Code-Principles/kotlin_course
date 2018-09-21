package oop

import oop.classes.Order
import oop.classes.OrderItem
import oop.classes.Robot
import oop.classes.RobotFactory
import utils.printLessonSectionName

fun main(args: Array<String>) {
    printLessonSectionName("Data Classes")
    val orderItem = OrderItem("Phone", 500.99f)
    val orderItem2 = OrderItem("Laptop", 850.50f)
    val orderItem3 = OrderItem("Phone", 500.99f)
    val order = Order(listOf(orderItem, orderItem2, orderItem3))
    println(order)
    println(orderItem == orderItem3)

    printLessonSectionName("Kotlin Objects")

    RobotFactory.create(Robot.robot_type_pilot)
    RobotFactory.create(Robot.robot_type_builder)
    val hackedRobot = object : Robot(Robot.robot_type_fighter) {
        override fun getName(): String {
            return "Secret!"
        }
    }
    RobotFactory.robotIndex.add(hackedRobot)
    for (robot in RobotFactory.robotIndex) {
        println(robot.getName())
    }
}