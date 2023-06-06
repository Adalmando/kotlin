package beecrowd

fun main() {
    var value = readLine()!!.toDouble()
    val notes = intArrayOf(100, 50, 20, 10, 5, 2)
    val coins = doubleArrayOf(1.0, 0.50, 0.25, 0.10, 0.05, 0.01)

    println("NOTAS:")
    for (note in notes) {
        val noteCount = (value / note).toInt()
        println("$note nota(s) de R$ ${note}.00")
        value %= note
    }

    println("MOEDAS:")
    for (coin in coins) {
        val coinCount = (value / coin).toInt()
        println("$coinCount moeda(s) de R$ ${"%.2f".format(coin)}")
        value %= coin
    }

}