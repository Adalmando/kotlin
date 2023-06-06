package beecrowd

fun main(){
    val A = readLine()!!.toDouble()
    val B = readLine()!!.toDouble()

    val media = ((A * 3.5) + (B * 7.5)) / (3.5 + 7.5)

    println("MEDIA = %.5f" .format(media))

}