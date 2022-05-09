package unsolved.codeforce

import kotlin.math.abs

fun main() {

    val noOfTests = readLine()!!.toLong()

    for (i in 1..noOfTests) {

        readLine()!!//length of list

        val tape1: List<Int> = readLine()!!.trim().split("\\s+".toRegex()).map(String::toInt)
        val tape2: List<Int> = readLine()!!.trim().split("\\s+".toRegex()).map(String::toInt)

        findBeauty(tape1, tape2)

    }
}

fun findBeauty(tape1: List<Int>, tape2: List<Int>) {
    val ans = arrayListOf<Int>()

    tape1.forEachIndexed { index, i ->
        val a = abs(i - tape2[index])
        ans.add(a)
    }

    println(ans.sum())

}
