package assignments

fun main(args: Array<String>) {

    //1)Create a lambda that take a string and returns a string with every word
    // capitalized.

    val lambda = { str: String ->
        str.split(" ").map { it.capitalize() }.joinToString(" ")
    }
    println(lambda("hello world"))

    //2)Create an extension function on String class that returns same string but with
    // every word capitalized.
    fun String.capitalizeEveryWord() =
            this.split(" ")
                    .map { it.capitalize() }
                    .joinToString(" ")
    println("hello world".capitalizeEveryWord())

    //2) Create a Robot class with a function that takes a lambda. This lambda will
    // control robots actions depending on robots state. If stopped then move, if moving
    // then stop.
    val robot = Robot()
    robot.executeBehaviour {
        state = if (state == Robot.State.Stopped) {
            Robot.State.Moving
        } else {
            Robot.State.Stopped
        }
    }

}

class Robot {
    enum class State { Moving, Stopped }

    var state = State.Stopped
    fun executeBehaviour(behaviour: Robot.() -> Unit) {
        behaviour()
    }
}