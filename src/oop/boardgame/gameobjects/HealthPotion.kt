package oop.boardgame.gameobjects

class HealthPotion(val health: Int) : BaseGameObject("Health Potion") {
    override fun interactWith(other: BaseGameObject) {
        //no implementation
    }
}