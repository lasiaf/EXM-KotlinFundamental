class Collection {
    fun listName() : List<String> {
        val names = listOf("Faisal", "Budi", "Andi")

        //println(names)
        return names;
    }

    fun listMutableName() : MutableList<String> {
        val names = mutableListOf("Faisal", "Budi", "Andi")

        //println(names)
        return names;
    }

    fun setName() : Set<Int> {
        val numbers = setOf(10, 20, 10, 30, 20)

        //println(names)
        return numbers;
    }

    fun setMutableName() : MutableSet<Int> {
        val numbers = mutableSetOf(10, 20, 10, 30, 20)

        //println(names)
        return numbers;
    }

    fun mapMutableName() : MutableMap<String, String> {
        val nim = mutableMapOf<String, String>(
            "K3513035" to "Faisal",
            "K3513020" to "Basyir",
            "K3513042" to "Marta",
            "K3513003" to "Aji",
            "K3513045" to "Ratih"
        )
        return nim;
    }

    fun mapName() : Map<String, String> {
        val nim = mapOf<String, String>(
            "K3513035" to "Faisal",
            "K3513020" to "Basyir",
            "K3513042" to "Marta",
            "K3513003" to "Aji",
            "K3513045" to "Ratih"
        )
        return nim;
    }
}