package assignments

import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking


fun main(args: Array<String>) = runBlocking {
    //1) Create a function that times the running time of async operation. In other
    // words create a function that starts a timer then starts async code, then stops
    // timer when code is finished and prints out the time the function took to run.
    val itemCount = Int.MAX_VALUE / 8
    println("${Thread.currentThread().name} has run.")
    println("Sorting array of $itemCount items...")
    val duration = timedBlock {
        launch {
            println("${Thread.currentThread().name} has run.")
            val bigList = IntArray(itemCount) {
                (Math.random() * (Int.MAX_VALUE - 1)).toInt()
            }
            bigList.sortDescending()
        }.join()
    }
    println("${Thread.currentThread().name} has run.")
    println("Sort function of $itemCount items took $duration milliseconds")
}

suspend fun timedBlock(runnable: suspend () -> Unit): Long {
    val startTime = System.currentTimeMillis()
    runnable()
    val endTime = System.currentTimeMillis()
    return endTime - startTime
}
