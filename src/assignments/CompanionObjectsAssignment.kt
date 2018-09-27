package assignments

fun main(args: Array<String>) {
    //1) Create class with companion object that will be used to pass messages between
    // the instances.
    val node1 = Node()
    val node2 = Node()
    Node.relayMessage("Hello everyone!")
    //2) Create a Kotlin object that serves as a singleton for returning instance of a
    // Settings data class.
}

//1
class Node {
    companion object {
        val listeners = mutableListOf<Node>()
        fun subscribe(listener: Node) {
            listeners.add(listener)
        }

        fun relayMessage(msg: String) {
            listeners.forEach { it.gotMessage(msg) }
        }
    }

    init {
        subscribe(this)
    }

    fun gotMessage(msg: String) {
        println(msg)
    }
}

object SettingsProvider {
    val settings = AppSettings(true, "PC", "http://www.google.com")

}

data class AppSettings(val isDebug: Boolean,
                       val platform: String,
                       val baseUrl: String)