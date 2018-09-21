package oop

import oop.classes.Athlete
import oop.classes.Person
import oop.classes.Student

fun main(args: Array<String>) {
    val people = mutableListOf<Person>()
    val simplePerson = Person("Joe", "Smith")
    val student = Student("Bob", "Doe")
    val athlete = Athlete("Tom", "Wayne")
    people.add(simplePerson)
    people.add(student)
    people.add(athlete)
    for (person in people) {
        if (person is Student) {
            println("${person.firstName} is a Student")
        } else if (person is Athlete) {
            println("${person.firstName} is and Athlete")
        } else {
            println("${person.firstName} is a regular person")
        }
        person.walk()
        if (person is Athlete) {
            println(if (person.isRunning) "Person is running" else "Person is stopped")
        } else {
            println(if (person.isMoving) "Person is moving" else "Person is stopped")
        }
        person.stop()
    }
}