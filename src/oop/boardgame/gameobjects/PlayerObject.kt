package oop.boardgame.gameobjects

abstract class PlayerObject(name: String) : BaseGameObject(name), WithHealth {

    override var health: Int = 100
    var powerLevel = 10
    open var weapon: Weapon = Weapon("Basic Stick", 10)
}