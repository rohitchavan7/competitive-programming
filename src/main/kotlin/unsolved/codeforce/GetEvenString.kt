package unsolved.codeforce

fun main() {
    val noTest = readLine()!!.toLong()

    for (i in 1..noTest) {
        val str = readLine()!!.trim()
        findEven(str)
    }
}

fun findEven(str: String) {
    val strArr = str.toCharArray().map { it.toString() }

    val group = strArr.sorted().groupBy { it }

    println(group)

    var ans = 0L
    group.forEach { (t, u) ->
        val rem = u.size % 2
        ans += rem

    }
    println(ans)

}
