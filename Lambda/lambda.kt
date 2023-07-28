// O QUE É LAMBDA: UMA FUNÇÃO ANÔNIMA QUE PODE SER PASSADA POR PARÂMETRO

// val funLambda { parametros de entrada(se precisar) -> retorno da função + corpo da função }
// uma função lambda pode ter apenas o retorno, sem entrada de parametros, nesse caso não precisamos usar a -> .
// o retorno da função é a ultima linha depois da seta, ou seja, o tipo de retorno quem diz é o criador da função
// não explicitamente, mas com o tipo de retorno que terá no fim.

// Exemplos de expressoes lambda:



fun main() {

    // criando e chamando uma função lambda sem parametros:
    val a = {println("Hello world!")}
    recebeA(a)
    // também podemos passar o lambda do parametro sem criar uma variavel:
    recebeA{
        println("Criando uma função anonima sem guarda-la em variavel!")
    }

    // criando e chamando uma função lambda com um parametro:
    val b = {a: Int -> println(a-1)}
    recebeB(b)


    // criando e chamando uma função lambda com mais de um parametro:
    val c = {a: Int, b: Int, c: Int -> println(maxOf(a,b,c))}
    recebeC(c)
}

// CRIANDO FUNÇÕES QUE RECEBEM FUNÇÕES LAMBDAS POR PARAMETRO:

// essa função vai receber a que é uma função sem parametro e que retorna um Unit(o println que nao tem tipo):
fun recebeA(lambda: () -> Unit){
    println("FUNÇÃO RECEBE A EM AÇÃO:")
    lambda()
}

// essa função recebe um lambda com parametro Int e retorno Unit:
fun recebeB(lambda: (a: Int) -> Unit){
    println("FUNÇÃO RECEBE B EM AÇÃO:")
    lambda(10)
}

// essa função recebe um lambda com parametros Int e retorno Unit:
fun recebeC(lambda: (a: Int,b:  Int,c: Int) -> Unit){
    println("FUNÇÃO RECEBE C EM AÇÃO:")
    lambda(10, 20, 30)
}

