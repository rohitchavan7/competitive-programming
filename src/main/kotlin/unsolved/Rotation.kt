package unsolved

fun main() {

    val n = readLine()!!.toInt()

    val arr = readLine()!!.trim().split("\\s+".toRegex()).map(String::toInt) as ArrayList

    println(rotateArray(n, arr))

}

fun rotateArray(n: Int, arr: ArrayList<Int>): ArrayList<Int> {
    val a = arr
    var x = n

    while (x > 0) {
        a.add(0, a.last())
        a.removeAt(arr.lastIndex)
        x--
    }
    return a

}
