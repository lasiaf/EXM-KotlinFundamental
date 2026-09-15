// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!")

    for (i in 1..5) {
        val re : Int = calc(i,i);
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i dan pangkat = $re")

        val e: String = "faisal"
        println("hello $e !")
    }

    collect()
}

fun calc(a: Int, b: Int): Int {
    return a * b
}
fun collect(){
    val collector = Collection();
    val data = collector.listMutableName();
    data.add("Doni")
    println(data);

    data.remove("Budi")
    println(data);
    println(data.first())
    println(data.last())

    val numSet= collector.setName();
    println(numSet);

    val numSetMuta= collector.setMutableName();
    numSetMuta.add(29)
    println(numSetMuta);

    val mapNama = collector.mapMutableName();
    println(mapNama)
    println(mapNama["K3513020"])
    mapNama.remove("K3513003")
    mapNama["K3513052"] = "Wasil"

    for ((id, name) in mapNama.toSortedMap()) {
        println("$id : $name")
    }


}