package exceptions

fun main(args: Array<String>) {
    println("Please enter a number:")
    var userNum: Int? = null
    try {
        userNum = multiply(readLine()?.toInt())
    } catch (e: NumberFormatException) {
        println("No! I said a number!")
    } finally {
        println("You entered $userNum")
    }
}

fun multiply(inNum: Int?): Int {
    return (inNum ?: 0) * 2
}