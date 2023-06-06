package ctrl_de_fluxo.while_do_while

// 1. considere uma caixa d'água de 2 mil litros. Rômulo gostaria de encher a caixa d'água com balões
// de água de 7 litros. Quantos balões cabem na caixa d'água sem que o volume seja excedido?

// 2. Imprima os números de 1 a 50 em ordem crescente de acordo com a regra abaixo:
// a. Quando um número for divisível por 3, imprimir Buzz.
// b. Quando um número for divisível por 5, imprimir Fizz.
// c. Quando um número for divisível por 3 e 5, imprimir FizzBuzz

// 3. Escreva um programa capaz de receber um texto e imprimí-lo invertido.
// Entrada: Meu nome é Julios. Saída: soiluJ é emon ueM

// 4. Escreva uma função que recebe uma string, verifica se existe a mesma quantidade de caracteres ´x´ e ´o´
// e retorna true ou false. Caso não exista nem ´x´ nem o ´o´, retornar false.
// "xxooox" -> true "xxxxo" -> false "bdjregeiub" -> false "ooooxzzzzz" -> false

fun main(){
    val caixa: Int = 2000
    var baloes: Int = 0
    var cont: Int = 0

    while(baloes < caixa){
        baloes+=7
        cont++
    }
    println("Seriam necessários $cont balões para encher a caixa dágua!")
}