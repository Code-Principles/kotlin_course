package oop.boardgame.gameobjects

class MainPlayer(name: String) : PlayerObject(name) {
    override fun interactWith(other: BaseGameObject) {
        if (other is Enemy) {
            other.tryDecreaseHealth(weapon.powerLevel)
        } else if (other is Weapon) {
            if (other.powerLevel > this.weapon.powerLevel) {
                this.weapon = other
            }
        } else if (other is HealthPotion) {
            health += other.health
        }
    }

    override fun tryDecreaseHealth(powerLevel: Int) {
        if (powerLevel > this.powerLevel) {
            health -= 10
        }
    }

}