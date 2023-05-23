package secao8

fun main(){

    val str: String? = null

    // VERIFICANDO SE STR É NULL E DIZENDO O QUE FAZER SE FOR E SE NÃO FOR
    if(str.isNullOrEmpty()){
        println("Nulo by ifelse")
    } else {
        println(str)
    }


    val nome: String? = null
    // OPERADOR ELIVS:
    // 'variavel' nula ou não! ':?' é null? 'instrução' pode ser função ou valores!
    println(nome ?: "nulo by elvis") // se for null printa 'nulo by elvis' se não, printa o que tiver na variavel!


}