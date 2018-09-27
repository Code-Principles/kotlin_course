package assignments


enum class Page { ONE, TWO }

fun main(args: Array<String>) {
    //1)Create an enum with couple options and ask user to pick one of the options then
    // store the choice in a variable.
    println("Type one or two:")
    when (readLine()!!.toLowerCase()) {
        Page.ONE.name.toLowerCase() ->
            println("You Entered ONE")
        Page.TWO.name.toLowerCase() ->
            println("You Entered TWO")
        else ->
            println("Wrong option entered")
    }

    //2)Create a class that has an inner and a nested classes inside. Instantiate and
    // use all three.
    val house = House.HouseBuilder().build()
    val tenant = house.Tenant()
}


class House private constructor() {
    inner class Tenant

    class HouseBuilder {
        fun build() = House()
    }
}

