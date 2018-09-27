package assignments

fun main(args: Array<String>) {
    //1) Create interface that has all the functions of a cell phone defined. Define
    // Android phone and iPhone implementations of the phone interface.

    //2) Create abstract class called Animal. Create subclasses of Horse and Whale.

}

//1
interface Phone {
    var number: Int
    var type: String

    fun call(number: Int)
    fun text(number: Int)
}

class Android : Phone {
    override var number = 1
    override var type = "Android"
    override fun call(number: Int) {
        println("calling $number")
    }

    override fun text(number: Int) {
        println("sending text to $number")
    }
}

class iPhone : Phone {
    override var number = 1
    override var type = "iPhone"
    override fun call(number: Int) {
        println("calling $number")
    }

    override fun text(number: Int) {
        println("sending text to $number")
    }
}

//2
abstract class Animal(val weight: Int, val age: Int) {
    abstract fun getHabitat(): String
}

class Horse(weight: Int, age: Int) : Animal(weight, age) {
    override fun getHabitat(): String {
        return "Barn"
    }
}

class Whale(weight: Int, age: Int) : Animal(weight, age) {
    override fun getHabitat(): String {
        return "See"
    }
}
