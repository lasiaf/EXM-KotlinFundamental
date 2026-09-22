import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.async
import kotlinx.coroutines.flow.flow

class CoroutineRun {

    fun proses() = runBlocking {

        launch {
            repeat(5) { i ->
                delay(1000)
                println("Coroutine: ${i + 1}")
            }
        }

        repeat(3) { i ->
            delay(500)
            println("Main Task: ${i + 1}")
        }


        val user = getUser()
        println(user)

        generateNumbers().collect {
            println("Flow : $it")
        }
    }

    fun hitungTotal(): Int = runBlocking {

        val hasil = async {
            delay(2000)
            100 + 200
        }

        hasil.await()

    }

    suspend fun getUser(): String {
        delay(1000)
        return "Faisal"

    }

    fun generateNumbers() = flow {

        for (i in 1..5) {
            delay(1000)
            emit(i)
        }

    }
}