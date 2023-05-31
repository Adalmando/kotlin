package beecrowd

import java.math.BigDecimal

fun main(args: Array<String>){

    val pecaUm = readLine()
    val totalUm = (pecaUm!!.split(" ")[1])!!.toInt() * (pecaUm!!.split(" ")[2])!!.toDouble()
    val pecaDois = readLine()
    val totalDois = (pecaDois!!.split(" ")[1])!!.toInt() * (pecaDois!!.split(" ")[2])!!.toDouble()

    val total: BigDecimal = BigDecimal(totalUm+totalDois)
    println("VALOR A PAGAR: R$ %.2f" .format(total))
}