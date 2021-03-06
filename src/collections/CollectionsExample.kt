package collections

import utils.printLessonSectionName

fun main(args: Array<String>) {
    printLessonSectionName("Arrays")
    val arr = arrayOf(0, 0, 0, 0, 0)
    printArr(arr)
    var mult = 1
    for (i in arr.indices) {
        mult *= 2
        arr[i] = mult
    }
    printArr(arr)

    printLessonSectionName("Lists")
    val list = listOf(listOf("Alex", "Smith"), listOf("Ollie", "Marty"), listOf("John", "Doe"))
    printNamesList(list)

    printLessonSectionName("Mutable Lists")
    val mutableList = mutableListOf<Int>()
    println("Please enter 5 numbers:")
    for (e in 1..5) {
        mutableList.add(readLine()!!.toInt())
    }
    printList(mutableList)
}

fun printNamesList(arr: List<List<String>>) {
    for (item in arr) {
        println("First:${item[0]}, Second:${item[0]}")
    }
}

fun printList(arr: List<Any>) {
    for (item in arr) {
        println(item)
    }
}

fun printArr(arr: Array<Int>) {
    for (item in arr) {
        println(item)
    }
}