package input_reading_formats

/**
 * Input example =>
 *
 *      6
 *      aabbdabdccc
 *      zyx
 *      aaababbb
 *      aabbcc
 *      oaoaaaoo
 *      bmefbmuyw
 *
 */


fun main() {

    val noOfString = readLine()!!.toLong()

    for (i in 1..noOfString) {

        val str = readLine()!!.trim()

        println(str)
    }


}