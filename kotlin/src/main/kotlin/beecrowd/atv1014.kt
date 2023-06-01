package beecrowd

fun main() {
    val x = readLine()!!.toInt()
    val y = readLine()!!.toDouble()
    val kml = x/y
    println("%.3f km/l" .format(kml))
}