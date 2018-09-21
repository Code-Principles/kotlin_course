package oop.boardgame.gameobjects

class Weapon(name: String, val powerLevel: Int) : BaseGameObject(name) {
    override fun interactWith(other: BaseGameObject) {
        //no implementation
    }
}