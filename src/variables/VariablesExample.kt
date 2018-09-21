package variables

fun main(args: Array<String>) {
    print("Please enter your age:")
    val age: Short = readLine()!!.toShort()
    println("Your age is $age")
    print("Please enter your name:")
    val name = readLine()
    println("Your name is $name")
    print("Number to add to your age:")
    val number: Short = readLine()!!.toShort()
    println("Your age in $number years will be ${age + number} years!")
}