interface Binatang {
    fun makan()
    fun bersuara()
}

class AnakKucing : Binatang {

    override fun makan() {
        println("Anak Kucing sedang makan ikan")
    }

    override fun bersuara() {
        println("Anak Kucing mengeong")
    }
}

class Anjing : Binatang {

    override fun makan() {
        println("Anjing sedang makan daging")
    }

    override fun bersuara() {
        println("Anjing menggonggong")
    }
}