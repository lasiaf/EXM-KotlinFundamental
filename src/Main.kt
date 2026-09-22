// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    collect()
    condition();
    loops();
    funcSum(8, 5);
    classSample();
    nullable();
    inHeritance();
    interfaces();
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
    classSampleData.compare(2,4)

    val tryClassData = tryClass(2, "muhfais@outlook.com")
    tryClassData.printId();

    val user = User("Alex", 1)
    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    println(user.copy())
    println(user.copy("Max"))
    println(user.copy(id = 3))

}

class tryClass(val id: Int, var email: String) {
    fun printId() {
        println(email)
    }
}

data class User(val name: String, val id: Int)

fun  nullable() {
    println("============ NULLABLE ============");

    var neverNull: String = "This can't be null"
    //neverNull = null //ERROR kkarena tidak boleh bernilai null

    var nullable: String? = "You can keep a null here"
    nullable = null

    fun lengthString(maybeString: String?): Int? = maybeString?.length

    fun strLength(notNull: String): Int {
        return notNull.length
    }

    fun describeString(maybeString: String?): String {
        if (maybeString != null && maybeString.length > 0) {
            return "String of length ${maybeString.length}"
        } else {
            return "Empty or null string"
        }
    }

    println(strLength(neverNull))
    val nullString: String? = null

    println(describeString(nullString))
    println(lengthString(nullString))
    println(nullString?.uppercase())
    println(nullString?.length ?: 0)

    //println(strLength(nullable)) //ERROR kkarena tidak boleh bernilai null
}

fun inHeritance(){
    println("============ INHERITANCE ============");
    val hewan = Hewan("Hewan Umum")
    hewan.bersuara()

    val kucing = Kucing("Mimi")
    kucing.bersuara()



    val kendaraan = Kendaraan("Generic")
    kendaraan.bergerak()
    println()

    val mobil = Mobil("Toyota", 4)

    mobil.info()
    mobil.bergerak()
    mobil.klakson()
    println()

    val mobilListrik = MobilListrik("Tesla", 4, 75)

    mobilListrik.info()
    mobilListrik.bergerak()
    mobilListrik.klakson()
    mobilListrik.charge()
}
fun interfaces () {
    println("============ INTERFACE ============");
    val kucing = AnakKucing()
    kucing.makan()
    kucing.bersuara()

    println()

    val anjing = Anjing()
    anjing.makan()
    anjing.bersuara()
}

