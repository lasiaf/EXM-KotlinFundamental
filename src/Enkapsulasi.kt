class RekeningBank(
    val namaPemilik: String
) {

    private var saldo: Double = 0.0

    fun setor(jumlah: Double) {
        if (jumlah > 0) {
            saldo += jumlah
            println("Berhasil setor Rp$jumlah")
        } else {
            println("Jumlah setor harus lebih dari 0")
        }
    }

    fun tarik(jumlah: Double) {
        if (jumlah <= 0) {
            println("Jumlah penarikan harus lebih dari 0")
        } else if (jumlah > saldo) {
            println("Saldo tidak mencukupi")
        } else {
            saldo -= jumlah
            println("Berhasil tarik Rp$jumlah")
        }
    }

    fun lihatSaldo() {
        println("Saldo $namaPemilik: Rp$saldo")
    }
}