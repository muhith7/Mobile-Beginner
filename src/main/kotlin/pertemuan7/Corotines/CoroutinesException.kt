package pertemuan7.Corotines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val job = launch {
        try {
            delay(2_000)
            throw Exception(" An error occurred")
        }catch (e : Exception){
            println("Exception : $e")
        }
    }
    job.join()
}

