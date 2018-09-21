package oop.classes

object RobotFactory {
    val robotIndex = mutableListOf<Robot>()
    fun create(type: Int): Robot {
        val robot = Robot(type)
        robotIndex.add(robot)
        return robot
    }
}