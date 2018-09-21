package operators

fun main(args: Array<String>) {
    var a: Int
    var b: Int
    println("Please enter a value:")
    a = readLine()!!.toInt()
    println("Please enter second value:")
    b = readLine()!!.toInt()
    //Arithmetic operators
    val sum = a + b
    val product = a * b
    val modulo = a % b
    println("Sum of $a and $b is $sum")
    println("Product of $a and $b is $product")
    println("Modulo of $a and $b is $modulo")

    //Assignment
    a += b
    println("a is now $a")
    a /= 2
    println("a is now $a")

    //Incr/Decr
    ++a
    println("a is now $a")
    --a
    println("a is now $a")

    //unary
    var likesCandy = true
    println("Do I like candy : $likesCandy")
    likesCandy = !likesCandy
    println("I don't like candy : $likesCandy")

    //Comparison
    println("a > b : ${a > b}")
    println("a < b : ${a < b}")
    println("a >= b : ${a >= b}")
    println("a == b : ${a == b}")

    //Logical
    val c = true
    val d = true
    println("c or b or a > b : ${c || d || a > b}")
    println("c and b and a is less than b : ${c && d && a <= b}")
}