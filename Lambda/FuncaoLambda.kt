// O QUE É LAMBDA: UMA FUNÇÃO ANÔNIMA QUE PODE SER PASSADA POR PARÂMETRO

// val funLambda { parametros de entrada(se precisar) -> retorno da função + corpo da função }
// o retorno da função é a ultima linha depois da seta, ou seja, o tipo de retorno quem diz é o criador da função
// não explicitamente, mas com o tipo de retorno que terá no fim.

// Exemplos de expressoes lambda:



fun main() {
    val soma = {a: Int, b: Int -> println(a + b)}
    soma(10, 2)
}