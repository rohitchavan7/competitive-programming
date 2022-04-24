package unsolved.codeforce

fun main() {

    val noOfTests = readLine()!!.toLong()

    for (i in 1..noOfTests) {

        //var lengthOfArray = readLine()!!.toLong()

        val arrValues: List<String> = readLine()!!.trim().split("\\s+".toRegex()).map { it }

        println(arrValues)
    }

}