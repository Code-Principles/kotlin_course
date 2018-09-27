package assignments

fun main(args: Array<String>) {
    //1)Create a list of colors then print out all the values
    val colors = listOf("Red", "Green", "Blue")
    for (color in colors) {
        println(color)
    }

    //2)Create an array of that starts at 10 and has all the numbers until 0. Then
    // print out all the elements in the array.
    val array = arrayListOf<Int>()
    (0..10).forEach {
        array += 10 - it
    }
    for (item in array) {
        println(item)
    }

    //3)Prompt user to enter a number, then print the sum of all the numbers between
    // the entered number and zero.
    println("Enter a number:")
    val input = readLine()!!.toInt()
    var sum = 0
    (input downTo 1).forEach {
        sum += it
    }
    println("Result:$sum")
}