package lambdas

fun main(args: Array<String>) {
    val greetingLambda = { name: String -> println("Hello, $name") }
    greetingLambda("Ollie")
    var accounts = mutableListOf<BankAccount>()
    (0..10).forEach {
        accounts.add(BankAccount("Jon Doe", (1..1_000_000).shuffled().last()))
    }

    accounts.sortBy { it.balance }
    val balances = accounts.filter(::filter)

    balances.forEach { bal ->
        println(bal)
    }
}

fun filter(account: BankAccount): Boolean {
    return account.balance > 500_000
}

data class BankAccount(val name: String, val balance: Int)