package beecrowd

fun main(){
    val n: Double = 3.14159
    val raio = readLine()
    val area = n * (raio!!.toDouble() * raio!!.toDouble())
    val final = String.format("%.4f", area)
    println("A=$final") // Output: 3.14
}