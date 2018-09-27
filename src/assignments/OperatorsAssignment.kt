package assignments

fun main(args: Array<String>) {
    //1)Add 3 and 7 then divide the sum by 2 and print out the result.
    val num = (3 + 7) / 2
    println("Result is $num")

    //2)Prove that 3 times 4 is greater than 5 times 2
    val left = 3 * 4
    val right = 5 * 2
    val proof = left > right
    println(proof)

    //3)Programmatically prove that 25 divided by 5 is equal 9 divided by 3
    val expression = 15 / 5 == 9 / 3
    println(expression)
}