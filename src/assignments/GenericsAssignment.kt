package assignments

fun main(args: Array<String>) {
    //1) Create Store class that uses generic type parameter of type Gadget
    // then create couple subclasses of Gadget class like Television, SoundSystem,
    // GameConsole. Finally print out the price total of all items in the store.
    val store = Store<Gadget>()
    store.stock.add(Television("LG", 500))
    store.stock.add(SoundSystem("Sony", 200))
    store.stock.add(GameConsole("XBOX", 400))
    println(store.getTotal())
}

class Store<T : Gadget> {
    val stock = mutableListOf<T>()
    fun getTotal() = stock.sumBy { it.price }
}

open class Gadget(val name: String, val price: Int)

class Television(name: String, price: Int) : Gadget(name, price)
class SoundSystem(name: String, price: Int) : Gadget(name, price)
class GameConsole(name: String, price: Int) : Gadget(name, price)