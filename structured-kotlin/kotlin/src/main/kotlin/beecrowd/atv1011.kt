package beecrowd

fun main() {
    val raio = readLine()!!.toDouble()
    val volume = ((4/3.0) * 3.14159 * raio*raio*raio)
    println("VOLUME = %.3f" .format(volume.toDouble()))
}