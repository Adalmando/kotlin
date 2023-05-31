package beecrowd

fun main(){
    val n = readLine()
    val horas = readLine()
    val valorHora = readLine()
    val salario = horas!!.toDouble()*valorHora!!.toDouble()

    println("NUMBER = $n")
    println("SALARY = U$ %.2f" .format(salario))
}