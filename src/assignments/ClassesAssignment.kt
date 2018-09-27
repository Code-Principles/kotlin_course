package assignments


fun main(args: Array<String>) {
    //1) Create a Math-class class which has a list of students and then get the
    // average mark on the students.
    val mathClass = MathClass()
    mathClass.students.add(Student("Joe", 90))
    mathClass.students.add(Student("Matt", 83))
    mathClass.students.add(Student("Cindy", 87))
    println("Class average is ${mathClass.getAverageMark()}")

    //2) Create a bicycle class with a primary constructor that will configure basic
    // version of a bike and have a secondary constructor that will configure a speed bike
    val regularBike = Bicycle()
    val speedBike = Bicycle(15, 7)

    //3) Create a library class with a collection of books. And have the library
    // provide a search function so you can find a book by author name.
    val lib = Library()
    lib.books.add(Book("Alex Smith", "Introduction to Programming"))
    lib.books.add(Book("Alexander McDonald", "Cooking Healthy"))
    lib.books.add(Book("Jeff Matt", "Baby Names"))

    val results = lib.find("alex")
    results.forEach {
        println(it.author + " : " + it.name)
    }
}

//1
class MathClass {
    val students = mutableListOf<Student>()
    fun getAverageMark(): Float {
        return students.sumBy { it.mark }.toFloat() / students.size.toFloat()
    }
}

class Student(val name: String, val mark: Int)

//2
class Bicycle() {
    var gears = 5
    var weight = 10

    constructor(gears: Int, weight: Int) : this() {
        this.gears = gears
        this.weight = weight
    }
}

//3

class Library {
    var books = mutableListOf<Book>()

    fun find(name: String) =
            books.filter {
                it.author
                        .toLowerCase()
                        .contains(
                                name.toLowerCase()
                        )
            }
}

class Book(val author: String, val name: String)