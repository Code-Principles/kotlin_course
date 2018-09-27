package assignments

fun main(args: Array<String>) {
    //1) Create Bike base class and create a function that modifies the velocity of
    // the bicycle and then create Motorcycle subclass and override the function that
    // changes the velocity.

    //2) Create Company class that has employees. Create Employee base class that has
    // name, salary and a function for doing  work. Then create Boss subclass that
    // overrides appropriate behaviours and add a function that can fire and hire other employees.
}

//1
open class Bike() {
    open var gears = 5
    open var weight = 10
    open var velocity = 5

    constructor(gears: Int, weight: Int) : this() {
        this.gears = gears
        this.weight = weight
    }

    open fun pedal() {
        velocity++
    }
}

class Motorcycle : Bike() {
    override fun pedal() {
        velocity += 10
    }

    fun throttle() {
        pedal()
    }
}

//2

class Company {
    val employees = mutableListOf<Employee>()
    fun fire(emp: Employee) {
        employees.remove(emp)
    }

    fun work() {
        for (emp in employees) {
            emp.doWork()
            if (emp is Boss) {
                for (other in employees) {
                    if (other != emp) {
                        emp.fireIfNeeded(other, this)
                    }
                }
            }
        }
    }
}

open class Employee(val name: String, val salary: Int, val rateOfWork: Int) {
    var work = 0
    fun doWork() {
        work += rateOfWork
    }
}

class Boss(name: String, salary: Int) : Employee(name, salary, 5) {
    fun fireIfNeeded(emp: Employee, company: Company) {
        if (emp.work < this.work) {
            company.fire(emp)
        }
    }
}