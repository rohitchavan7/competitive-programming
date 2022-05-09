package input_reading_formats

/**
 * Input example =>
 *
 *      3         number of test cases
 *      3         length of array
 *      5 2 7     -values
 *      5
 *      1 4 2 2 3
 *      2
 *      2 6
 *
 */


fun main() {

    val numberOfTestCase = readLine()!!.toLong()

    for (i in 1..numberOfTestCase){
        val arrayValues = arrayListOf<Long>()

        readLine()!!//length of array

        readLine()!!.trim().split("\\s+".toRegex()).map { items ->
            arrayValues.add(items.toLong())

        }// It reads whitespace separated values into list

        println(arrayValues.joinToString(" "))
    }

}

//or

fun readArrayList() {
    val numberOfTestCase = readLine()!!.toLong()

    for (i in 1..numberOfTestCase) {

        readLine()!!//no items in list

        val list: List<Int> = readLine()!!.trim().split("\\s+".toRegex()).map(String::toInt)

        println(list)
    }
}