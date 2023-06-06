package beecrowd


fun triangulo(A: Double, C: Double): Double{
    return (A*C)/2
}
fun circulo(C: Double): Double{
    return 3.14159 * (C*C)
}
fun trapezio(A: Double, B: Double, C: Double): Double{
    return  (A + B) * C / 2
}
fun quadrado(B: Double): Double{
    return B*B
}
fun retangulo(A: Double, B: Double): Double{
    return A*B
}
fun main() {
    val entry = readLine()
    val A = (entry!!.split(" ")[0]).toDouble()
    val B = (entry.split(" ")[1]).toDouble()
    val C = (entry.split(" ")[2]).toDouble()
    println("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f"
        .format(triangulo(A,C), circulo(C), trapezio(A, B, C), quadrado(B), retangulo(A, B)))

}