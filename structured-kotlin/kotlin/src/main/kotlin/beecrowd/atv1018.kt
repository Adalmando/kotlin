package beecrowd

fun main() {

    var valor = readLine()!!.toInt()

    val cedulas = intArrayOf(100, 50, 20, 10, 5, 2, 1)

    println(valor)
    for(cedula in cedulas){
        val quant = valor/cedula
        println("$quant nota(s) de R$ $cedula,00")
        valor %= cedula
    }

}