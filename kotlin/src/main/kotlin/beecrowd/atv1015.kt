package beecrowd

import kotlin.math.sqrt

fun main() {

    val p1 = readLine()
    val p2 = readLine()

    val x1 = (p1!!.split(" ")[0]).toDouble()
    val y1 = (p1!!.split(" ")[1]).toDouble()

    val x2 = (p2!!.split(" ")[0]).toDouble()
    val y2 = (p2!!.split(" ")[1]).toDouble()

    val distancia = sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1) )

    println("%.4f" .format(distancia))
}