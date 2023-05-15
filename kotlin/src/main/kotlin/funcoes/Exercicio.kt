package funcoes

// 1. Escreva uma função que seja capaz de receber a quantidade de anos e transformar
//em meses, dias, horas, minutos e segundos. Saída desejada:
// 2 anos equivalem a:
// 24 meses
// 730 dias
// 17520 horas
// 1051200 minutos
// 63072000 segundos

fun transformaAnos(anos: Int){
    println("$anos anos equivalem a:")
    println("${anos*12} meses")
    println("${anos*365} dias")
    println("${anos*365*24} horas")
    println("${anos*365*24*60} minutos")
    println("${anos*365*24*60*60} segundos")
}

// 2. Escreva uma função capaz de receber uma string e retornar a quantidade de caracteres.
fun contaCaracteres(entrada: String) = entrada.length

// 3. Escreva uma função capaz de calcular o cubo de um número inteiro (cubo = n*n*n).
fun cubo(numero: Int) = numero*numero*numero

// 4. Escreva uma função capaz de receber milhas e converter em km (1 milha = 1,6km).
fun converteMilhas(entrada: Float) = entrada*1.609f

// 5. Escreva um programa que seja capaz de receber uma string e fazer a troca de todas as letras "a" ou "A" por "x".
fun parseA(valor: String){
    println("${valor.lowercase().replace('a', 'x')}")
}

// 6.
fun main(){

    transformaAnos(2)
    println(contaCaracteres("adalmando"))
    println(cubo(3))
    println(converteMilhas(100f ))
    parseA("ADALMANDO")

}