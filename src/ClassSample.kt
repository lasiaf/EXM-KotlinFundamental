class ClassSample(val id: Int, var email: String) {
    val category: String = email

    fun square(): Int{
        val res : Int;
        res = id * 2;

        return res;
    }

    fun justPrint(){
        println("Just Print")
    }

    fun compare(a : Int, b : Int){
        println("a == b: ${a == b}")
    }
}
