open class Hewan(
    val nama: String
) {
    open fun bersuara() {
        println("$nama mengeluarkan suara")
    }
}

class Kucing(
    nama: String
) : Hewan(nama) {

    override fun bersuara() {
        println("$nama mengeong")
    }
}

open class Kendaraan(
    val merk: String
) {
    open fun bergerak() {
        println("$merk sedang bergerak")
    }

    fun info() {
        println("Merk kendaraan: $merk")
    }
}

open class Mobil(
    merk: String,
    val jumlahRoda: Int
) : Kendaraan(merk) {

    override fun bergerak() {
        println("$merk berjalan menggunakan $jumlahRoda roda")
    }

    fun klakson() {
        println("$merk: TIN TIN!")
    }
}

class MobilListrik(
    merk: String,
    jumlahRoda: Int,
    val kapasitasBaterai: Int
) : Mobil(merk, jumlahRoda) {

    override fun bergerak() {
        println("$merk bergerak menggunakan tenaga listrik")
    }

    fun charge() {
        println("$merk sedang mengisi baterai $kapasitasBaterai kWh")
    }
}
