package functions

import utils.printLessonSectionName

var count: Int = 0
fun main(args: Array<String>) {
    printLessonName()
    incrementCount()
    printLessonSectionName("Functions returning nothing")
    incrementCount()
    printLessonSectionName("Function returning values")
    incrementCount()
    val a = sum(11, 5)
    val b = sum(3, 4)
    val sum = sum(a, b)
    println("Sum function result:$sum")
    incrementCount()
    println("Output line count:$count")
    printLessonSectionName("Complex operations")
    println(complexMath(3, 7))
}

fun complexMath(a: Int, b: Int): String {
    var output = 0
    output = sum(a, b)
    output = sum(output, output)
    incrementCount()
    output = sum(count, output)
    output = multiply(output, 4)
    return "The result is $output"
}

fun multiply(a: Int, b: Int): Int {
    return a * b
}

fun incrementCount() {
    ++count
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun printLessonName() {
    println("Functions Lesson")
}
