package funcoes
// Funções e propriedades de uma String:

fun main(){
    val str = "Programando em kotlin"

    // PROPRIEDADES:
    println("O tamanho da string é\n${str.length}")
    println("O índice 9 da string é\n${str[9]}")

    // FUNÇÔES:
    // primeiro atributo desse metodo é o char ou String que quero buscar, e o segundo é ignorecase; true ou false:
    println("Checando se nossa string começa com 'Pr':\n${str.startsWith("pr", true)}")
    // primeiro atributo desse metodo é o char ou String que quero buscar, e o segundo é ignorecase; true ou false:
    println("Checando se nossa string termina com 'in':\n${str.endsWith("iN", true)}")

    println("Pegando substring da minha string: index 0 ao 5: ${str.substring(0, 5)}") // Não pega o index 5<

    // Método que altera a parte de uma string que eu quiser:
    println(
        "Reescrevendo parte da string:\n${str.replace("Kotlin", "Kotlin de cria", true)}")

    println("Transformando a string em uma string com tudo maiúsculo:\n${str.uppercase()}")

    println("Transformando a string em uma string com tudo minúsculo:\n${str.lowercase()}")

    val vazio = "     Adalmando Araujo     "
    println(vazio)

    println("Eliminando o espaço vazio das bordas da String:\n${vazio.trim()}")
}