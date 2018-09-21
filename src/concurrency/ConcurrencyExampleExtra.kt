package concurrency

import kotlinx.coroutines.experimental.async
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking
import java.util.concurrent.atomic.AtomicBoolean

var counter = 0

fun main(args: Array<String>) = runBlocking {

    complexCoroutineExample()
}

suspend fun complexCoroutineExample() {
    runBlocking {
        val duration = timedBlock {
            val sum = (0L..1_000_000L)
                    .map {
                        async {
                            longRunningOperation(it)
                        }

                    }.sumBy { it.await() }
            println("\nAverage age is ${sum / 1_000_000L}")
        }


        println("Operation took: ${(duration) / 1000L}s")
    }
}

suspend fun longRunningOperation(id: Long): Int {
    delay(1000)
    val random = (Math.random() * 90 + 1).toInt()
    val p = Person(id, "John Doe", random)
    return p.age
}

fun startTimerFunction(): AtomicBoolean {
    val timerFlag = AtomicBoolean(true)
    println("Timer Started:")
    launch {
        do {
            delay(1000)
            counter++
            print("\r${counter}s")
        } while (timerFlag.get())
        println("Timer Ended")
    }
    return timerFlag
}

class Person(val id: Long, val name: String, val age: Int)

suspend fun timedBlock(runnable: suspend () -> Unit): Long {
    val startTime = System.currentTimeMillis()
    var timerFlag = startTimerFunction()
    runnable()
    timerFlag.set(false)
    val endTime = System.currentTimeMillis()
    return endTime - startTime
}
