package funcoes

import java.util.Date

fun main(){

    transformaAnos(2)
    println(contaCaracteres("adalmando"))
    println(cubo(3))
    println(converteMilhas(50.0 ))

}

// 1. Escreva uma função que seja capaz de receber a quantidade de anos e transformar
//em meses, dias, horas, minutos e segundos. Saída desejada:
// 2 anos equivalem a:
// 24 meses
// 730 dias
// 17520 horas
// 1051200 minutos
// 63072000 segundos

fun transformaAnos(anos: Int){
    println("$anos anos equivalem a:\n" +
            "${anos*12} meses\n" +
            "${anos*365} dias\n" +
            "${anos*8766} horas\n" +
            "${anos*525960} minutos\n" +
            "${anos*31536000} segundos\n")
}

// 2. Escreva uma função capaz de receber uma string e retornar a quantidade de caracteres.
fun contaCaracteres(entrada: String) = entrada.length

// 3. Escreva uma função capaz de calcular o cubo de um número inteiro (cubo = n*n*n).
fun cubo(numero: Int) = numero*numero*numero

// 4. Escreva uma função capaz de receber milhas e converter em km (1 milha = 1,6km).
fun converteMilhas(entrada: Double) = entrada*1.609