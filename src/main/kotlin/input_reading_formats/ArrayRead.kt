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
        }

        println(arrayValues.joinToString(" "))
    }


}