package beecrowd

fun main() {

    val entrada = readLine()!!.toInt()
    val tempo = intArrayOf(216000, 3600, 60)

    val resultado =ArrayList<Int>()

    for(t in tempo){
        var resto = entrada
        if(resto>t){
            resultado.add(resto/t)
            resto = resto%t
        }else{
            resultado.add(0)
        }
    }

    for(i in resultado){
        println(i)
    }

}