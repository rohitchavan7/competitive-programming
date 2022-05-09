package unsolved.codeforce

fun main() {

    val noOfTests = readLine()!!.toLong()

    for (i in 1..noOfTests) {

        readLine()!!//length of list

        val arr: List<Int> = readLine()!!.trim().split("\\s+".toRegex()).map(String::toInt)

        findTuples(arr.sorted())
    }


}

fun findTuples(arr: List<Int>) {

    println(arr)

}
