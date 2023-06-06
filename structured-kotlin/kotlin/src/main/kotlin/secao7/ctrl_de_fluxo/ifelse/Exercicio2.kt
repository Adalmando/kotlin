package ctrl_de_fluxo.ifelse

//1  Escreva um programa capaz de ler dois números inteiros que representam os lados de uma figura
// geométrica. Informar se formam um quadrado (lados iguais).

fun quadrado(a: Int, b: Int): String {
    return if (a == b) {"É um quadrado!"} else {"Não é um quadrado!"}
}

// 2 Escreva um programa capaz de ler três números inteiros que representam os lados de um triângulo. Informar
// se é um triângulo equilátero (todos os lados iguais).

fun triangulo(a: Int, b: Int, c: Int): String{
    return if(a==b && a==c){
        "É um triangulo equilátero!"
    }else{
        "Não é um triangulo equilátero!"
    }
}

// 3 Considere o código abaixo. Qual a saída do programa caso informado o valor 4?
 fun qualASaida(num: Int) {
    if (num >= 0) {
        if (num == 0)
            println("Primeira string")
        else println("Segunda string")
    }
    println("Terceira string")
 }
// o resultado é: Segunda string
//                Terceira string











fun main(){
    println(quadrado(17, 17))
    println(triangulo(20,20,20))
    qualASaida(4)
}