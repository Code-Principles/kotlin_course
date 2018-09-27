package assignments

fun main(args: Array<String>) {
    //1)Ask the user to enter a Float then safely parse it and return the double. I
    // user entered invalid number notify the user and ask them to enter again.
    var num: Float?
    do {
        println("Enter a Float:")
        num = readLine()?.toFloatOrNull()
    } while (num == null)
    println("Double your number is ${num * 2.0f}")
}