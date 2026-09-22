open class Burung(
    val nama: String
) {

    open fun habitat() {
        println("$nama hidup di bumi")
    }
}

class Murai(
    nama: String
) : Burung(nama) {

    override fun habitat() {
        println("$nama hidup di pohon")
    }
}

class Pinguin(
    nama: String
) : Burung(nama) {

    override fun habitat() {
        println("$nama hidup di kutub")
    }
}


open class Pegawai {

    open fun hitungGaji() {
        println("Gaji pegawai umum")
    }
}

class Programmer : Pegawai() {

    override fun hitungGaji() {
        println("Gaji Programmer: Rp10.000.000")
    }
}

class Manager : Pegawai() {

    override fun hitungGaji() {
        println("Gaji Manager: Rp15.000.000")
    }
}