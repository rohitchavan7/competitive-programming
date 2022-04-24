package solved.google.kick_start_b_2022

import kotlin.math.PI

/**
 * Solved => Infinity Area (Google Kick-Start round B - 2022)
 *
 * (link - https://codingcompetitions.withgoogle.com/kickstart/round/00000000008caa74/0000000000acf079)
 *
 */

fun main() {

    val numberOfTestCase = readLine()!!.toLong()

    for (i in 1..numberOfTestCase) {

        val (r, a, b) = readLine()!!.trim().split("\\s+".toRegex()).map(String::toInt)
        val input = Input(r,a,b)

        println("Case #$i: ${calculateCircleArea(input)}")


    }

}

fun calculateCircleArea(input: Input): Double {
    val a = PI * input.R * input.R
    val areaList = arrayListOf(a)

    var dir = Direction.LEFT

    var r = input.R

    while (r > 0) {

        if (dir == Direction.LEFT) {
            r *= input.A
            val ar = PI * r * r
            areaList.add(ar)
            dir = Direction.RIGHT


        } else {
            r /= input.B
            val ar = PI * r * r
            areaList.add(ar)
            dir = Direction.LEFT

        }

    }

    return areaList.sum()
}

enum class Direction{
    LEFT,
    RIGHT
}

data class Input(
    val R: Int,
    val A: Int,
    val B: Int
)


/**
 * Example
 *
 * input ->
 *          2 - no of tests
 *          1 3 6
 *          5 2 5
 *
 *
 * output ->
 *          31.415927
 *          455.530935
 *
 *
 **/