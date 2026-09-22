// 1. Lambda
fun contohLambda() {

    val tambah = { a: Int, b: Int -> a + b }

    val hasil = tambah(10, 20)

    println("Hasil Lambda: $hasil")
}


// 2. Higher Order Function
fun hitung(
    a: Int,
    b: Int,
    operasi: (Int, Int) -> Int
): Int {
    return operasi(a, b)
}


// 3. Filter
fun contohFilter() {

    val angka = listOf(1, 2, 3, 4, 5, 6)

    val angkaGenap = angka.filter {
        it % 2 == 0
    }

    println("Filter: $angkaGenap")
}


// 4. Map
fun contohMap() {

    val angka = listOf(1, 2, 3, 4, 5)

    val kuadrat = angka.map {
        it * it
    }

    println("Map: $kuadrat")
}


// 5. Reduce
fun contohReduce() {

    val angka = listOf(1, 2, 3, 4, 5)

    val total = angka.reduce {
            accumulator, nilai ->
        accumulator + nilai
    }

    println("Reduce: $total")
}