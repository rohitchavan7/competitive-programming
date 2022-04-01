package unsolved.codeforce


fun main() {

    val noTest = readLine()!!.toLong()

    for (i in 1..noTest) {
        val noOfCandy = mutableListOf<Long>()

        val type = readLine()!!.toLong()

        readLine()!!.trim().split("\\s+".toRegex()).map { items ->
            noOfCandy.add(items.toLong())
        }

        canEatAllCandies(type, noOfCandy)

    }

}

fun canEatAllCandies(type: Long,noOfCandy: List<Long>) {

    val sum = noOfCandy.sorted()

    while (sum.last() > 0) {

        


    }



}
