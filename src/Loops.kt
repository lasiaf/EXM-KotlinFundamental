class Loops {
    fun loopFor(value : Int){
        for (number in 1..value) {
            // number is the iterator and 1..5 is the range
            print(number)
        }
    }

    fun loopCollection(value : MutableMap<String,String>) {
        for ((id, name) in value) {
            println("$id : $name")
        }
    }
    fun loopWhile(value : Int) {
        var cakesEaten = 0

        while (cakesEaten < value) {
            println("Eat a cake")
            cakesEaten++
        }


        cakesEaten = 0
        do {
            println("Bake a cake")
            cakesEaten++
        } while (cakesEaten < value)
    }
}