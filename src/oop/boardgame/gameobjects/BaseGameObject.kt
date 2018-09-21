package oop.boardgame.gameobjects

abstract class BaseGameObject(val name: String) {
    abstract fun interactWith(other: BaseGameObject)
    fun printName() {
        println(name)
    }
}