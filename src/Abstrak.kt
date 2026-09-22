abstract class Mahluk(
    val nama: String
) {

    // Abstract function
    abstract fun bersuara()

    // Function biasa
    fun makan() {
        println("$nama sedang makan")
    }
}

class IndukKucing(
    nama: String
) : Mahluk(nama) {

    override fun bersuara() {
        println("$nama mengeong")
    }
}

class IndukAnjing(
    nama: String
) : Mahluk(nama) {

    override fun bersuara() {
        println("$nama menggonggong")
    }
}