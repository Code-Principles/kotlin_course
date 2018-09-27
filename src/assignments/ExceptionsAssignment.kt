package assignments

fun main(args: Array<String>) {
    //1) Ask user to enter two numbers, then safely add them together. If user doesn't
    // enter numbers correctly, ask them again. Make sure the app doesn't crash if the
    // user enters invalid input like text.
    var finished = false
    do {
        var sum: Int
        println("Please enter a number:")
        val one = readLine()
        println("Please enter a another number:")
        val two = readLine()
        try {
            sum = one!!.toInt() + two!!.toInt()
            println("Sum is: $sum")
        } catch (e: Exception) {
            println("..try again")
        }
    } while (!finished)

}