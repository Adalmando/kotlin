package beecrowd

fun main() {

    val horas = readLine()!!.toDouble()
    val kmh = readLine()!!.toDouble()
    val resultado = horas*kmh / 12
    println("%.3f".format(resultado))

}