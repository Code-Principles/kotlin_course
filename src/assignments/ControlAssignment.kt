package assignments

fun main(args: Array<String>) {
    //1)Print out the pattern below using multiple loops:
    //*
    //**
    //***
    //****
    //***
    //**
    //*

    var space = 0
    var reverse = false
    (0..8).forEach {
        if (!reverse) {
            println()
            (0 until space).forEach {
                print("*")
            }
            if (space == 3)
                reverse = true
            space++
        } else {
            println()
            (0 until space).forEach {
                print("*")
            }
            space--
        }

    }

    //2)Prompt the user to enter a number that is divisible by 3 without remainder.

    do {
        println("Enter a number divisible by 3:")
        val input = readLine()!!.toInt()
    } while (input % 3 != 0)

    //3)When a user enters "hello" print out "hi", when a user enters "goodbye" print
    // "bye", else ask for input again.
    var done = false
    do {
        println("Enter something:")
        val input = readLine()
        when (input) {
            "hello" -> {
                println("hi")
                done = true
            }
            "goodbye" -> {
                println("bye")
                done = true
            }
        }
    } while (!done)
}