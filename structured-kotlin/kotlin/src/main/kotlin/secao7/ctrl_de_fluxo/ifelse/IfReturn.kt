package ctrl_de_fluxo.ifelse

// o return if é uma abreviação se eu sei que a função retorna algo com base no condicional:
fun dia(dia: Boolean){
    return if(dia){
        println("Bom dia!")
    }else{
        println("Boa noite!")
    }
}

// OUTRA FORMA DE ESCREVER A FUNÇÂO:
fun diaDois(dia: Boolean) = if(dia){
    println("Bom dia!")
} else{
    println("Boa noite!")
}

fun main(){
    dia(true)
    dia(false)
    diaDois(false)
    diaDois(true)
}