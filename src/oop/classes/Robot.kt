package oop.classes

open class Robot(val robotType: Int) {
    companion object {
        var robotCount: Int = 0
        val robot_type_builder = 0
        val robot_type_fighter = 1
        val robot_type_pilot = 2

        fun formatName(robot: Robot): String {
            val typeName = when (robot.robotType) {
                robot_type_builder -> {
                    "b"
                }
                robot_type_fighter -> {
                    "f"
                }
                robot_type_pilot -> {
                    "p"
                }
                else -> {
                    "x"
                }
            }
            return "Robot_${robot.id}_$typeName"
        }
    }

    private val id: Int = robotCount++

    open fun getName(): String {
        return formatName(this)
    }
}