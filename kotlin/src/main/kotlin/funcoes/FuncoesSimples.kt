package funcoes

fun main(){
    println(soma(10, 50))
    println(bomDia())
    println(helloWorld("Adalmando"))
    print()
}

// fun é assinatura, soma é o nome da função, valor1 e seu tipo é o parametro1,
// valor2 e seu tipo é o parametro2, Int no final é o tipo de retorno da função.
// OBS: a função pode receber mais de 2 parametros.
fun soma(valor1: Int, valor2: Int): Int{
    return valor1+valor2
}

// Função sem parametros:
fun bomDia(): String{
    return "Bom-diaaaaa!"
}

// Função com um parametro:
fun helloWorld(nome: String): String{
    return "Olá, $nome"
}

fun print(){
    println("Função sem retorno, como o void em java!")
}

// RETORNOS POSSÍVEIS PARA FUNÇÕES:

// Unit = O tipo Unit diz que uma função não possui retorno. A função executa seu corpo e termina sua execução.

// Double, Float, Long, Int, Short, Byte, Boolean, String e Char.

// Instancias de classes= Uma função é capaz de retornar um tipo de dado resultante da instancia de uma classe.