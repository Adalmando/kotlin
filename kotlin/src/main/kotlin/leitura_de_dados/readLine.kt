package leitura_de_dados

import kotlin.reflect.typeOf

// semelhante ao scanner em java:
// sempre recebe valores String, se quiser depois é so converter:

fun main(){
    print("Ditige seu nome: ")
    val nome = readLine()
    print("Agora digite sua idade: ")
    var idade = readLine()

    // PARA CONVERTER STRING PARA NUMEROS/BOOLEAN TEMOS QUE CHECAR ANTES SE A VARIAVEL NÃO É NULL:
    if(idade != null && idade != ""){
        idade.toInt()
        idade.toFloat()
        idade.toDouble()
        idade.toBoolean()
    }

    if(idade != null && idade != ""){
    println("Bem-vindo, $nome, você tem ${idade.toInt()} anos!")}



}