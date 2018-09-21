package oop

import utils.printLessonSectionName

fun main(args: Array<String>) {
    printLessonSectionName("Enum Example:")
    println("Type 1 for Inner Class Example, or 2 for Nested Class Example")
    val input = readLine()?.toInt() ?: 0
    when (input) {
        Options.INNER_EXAMPLE.id -> {
            val outer = Outer()
            val inner = outer.Inner()
            outer.printHello()
            inner.printHello()
        }
        Options.NESTED_EXAMPLE.id -> {
            val nested = Outer.Nested()
            nested.printHello()
        }
        else -> {
            print("Sorry, please enter a correct option!")
        }
    }
}

enum class Options(var id: Int) {
    INNER_EXAMPLE(1), NESTED_EXAMPLE(2)
}

class Outer {
    class Nested {
        fun printHello() {
            println("Hello from nested!")
        }
    }

    inner class Inner {
        fun printHello() {
            println("Hello from inner!")
            this@Outer.printHello()
        }
    }

    fun printHello() {
        println("Hello from outer!")
    }
}