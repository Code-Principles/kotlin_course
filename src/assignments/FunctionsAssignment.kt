package assignments

fun main(args: Array<String>) {
    //1) Create a function that takes two integer numbers and returns their product.
    // Pass any two numbers to the function and print out the result
    fun mult(one: Int, two: Int): Int {
        return one * two
    }
    println(mult(4, 6))

    //2) Create a function that takes user input as an integer and then doubles it and
    // prints out the result.
    fun double(input: Int) {
        val res = mult(input, input)
        println(res)
    }
    println("Enter a number:")
    double(readLine()!!.toInt())

    //3) Create a function in a different file then the one you will be using it in.
    // Make this function take any string as a parameter and return an uppercase
    // version of the input.
    val cap = format("Hello, World!")
    println(cap)
}