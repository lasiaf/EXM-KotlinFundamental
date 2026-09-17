// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    collect()
    condition();
    loops();
    funcSum(8, 5);
    classSample();
}

fun calc(a: Int, b: Int): Int {
    return a * b
}
fun condition(){
    println("============ CONDITION ============");

    val conditionData = Conditions()
    val data = conditionData.conIf((4))
    println("IF CONDITIONS : $data");
    println("WHEN CONDITIONS : ${conditionData.conWhen((4))}");

}
fun loops() {
    println("============ LOOPS ============");
    val loopData = Loops()
    loopData.loopFor(9)
    loopData.loopWhile(5)
}
fun collect(){
    println("============ COLLECTION ============");
    val loopData = Loops()

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


    loopData.loopCollection(mapNama.toSortedMap())
}
fun funcSum(x: Int, y: Int): Int {
    val res : Int = x + y;
    val nama : String = "Muhammad Harr"
    println("============ FUNCTION ============");
    println(res)
    println("Lambda Expression : ${nama.uppercase()}");

    return x + y
}

fun classSample() {
    println("============ CLASS ============");

    val classSampleData = ClassSample(4, "fais@gmail.com")
    println(classSampleData.category);
    println(classSampleData.square());
    classSampleData.justPrint()

    val tryClassData = tryClass(2, "muhfais@outlook.com")
    tryClassData.printId();
}

class tryClass(val id: Int, var email: String) {
    fun printId() {
        println(id)
    }
}