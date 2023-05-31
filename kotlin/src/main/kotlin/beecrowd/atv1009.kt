package beecrowd

import java.math.BigDecimal
fun main(){
    val nome = readLine()
    val salarioFixo = readLine()!!.toDouble()
    val vendasTotal = readLine()!!.toDouble()
    val totalReceber:BigDecimal = BigDecimal(salarioFixo + vendasTotal*0.15)
    println("TOTAL = R$ %.2f".format(totalReceber))
}