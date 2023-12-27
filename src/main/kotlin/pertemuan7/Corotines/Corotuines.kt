package pertemuan7.Corotines

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {

    // Contoh launch
    launch {
        delay(2_000)
        println("coroutines is running")
    }

    // contoh async
    val deferred =
        async {
            delay(3_000)
            "hello from async"
        }
    println(deferred.await())
}
