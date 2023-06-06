package beecrowd

import kotlin.math.abs

fun main() {
    val entry = readLine()
    val A = (entry!!.split(" ")[0]).toInt()
    val B = (entry.split(" ")[1]).toInt()
    val C = (entry.split(" ")[2]).toInt()
    val maiorAB = (A + B + abs(A - B)) / 2
    val maiorFinal = (maiorAB + C + abs(maiorAB - C)) / 2
    println("$maiorFinal eh o maior")
}