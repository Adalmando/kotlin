package beecrowd

fun main(){
    val A = readLine()!!.toDouble()
    val B = readLine()!!.toDouble()
    val C = readLine()!!.toDouble()

    val media = ((A*2)+(B*3)+(C*5)) / 10
    println("MEDIA = %.1f".format(media))
}