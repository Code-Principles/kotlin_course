package nullsafety

import utils.printLessonSectionName

fun main(args: Array<String>) {
    printLessonSectionName("Nulls")
    val input = readLine()
    if (input != null) {
        println(input.toInt())
    } else {
        println("Your input was null!")
    }
    //safe call
    println("Enter another number:")
    println(readLine()?.toInt())
    //array with possible nulls
    val arr = arrayOf<String?>("One", null, "Two")
    for (item in arr) {
        println("length is ${item!!.length}")
    }
}