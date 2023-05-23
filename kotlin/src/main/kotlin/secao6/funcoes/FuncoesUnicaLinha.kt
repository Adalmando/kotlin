package funcoes

fun main(){
    println(subtracao(40, 20))
    println(multiplicacao(10,4))
    printar()
    println(divisao(10f,3f))

}

// Quando uma função tem apenas uma instrução, podemos cria-la em uma unica linha:
fun subtracao(a: Int, b: Int): Int = a-b

// Simplificando mais ainda, se o resultado da função ja é esperado que seja inteiro,
// não preciso especificar o tipo de retorno:
fun multiplicacao(a: Int, b: Int) = a*b // a e b são int, então o resultado espera-se que seja int

// função sem retorno e sem parametro se tiver apenas 1 instrução: 1 linha:
fun printar() = println("Função em 1 linha")

fun divisao(a: Float, b: Float) = a/b