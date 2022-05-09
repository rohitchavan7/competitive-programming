package unsolved.codeforce

fun main() {
    val noOfTests = readLine()!!.toLong()

    for (i in 1..noOfTests) {

        val (n, m) = readLine()!!.trim().split("\\s+".toRegex()).map(String::toLong)

        val students = readLine()!!

        arrangeMeeting(n, m, students)

    }

}

fun arrangeMeeting(n: Long, m: Long, students: String) {

    val table = Array(n.toInt()) { IntArray(m.toInt()) }

    table.forEach {
        it.forEach {
            
        }
    }


}
