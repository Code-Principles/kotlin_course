package oop.boardgame.gameobjects

interface WithHealth {
    var health: Int
    fun tryDecreaseHealth(powerLevel: Int)
}