import java.lang.NullPointerException

fun countXO(str: String): Boolean {
    val strLower = str.lowercase()

    var i = 0
    var countX = 0
    var countO = 0
    while (i < strLower.length) {
        if (strLower[i] == 'x') {
            countX++
        } else if (strLower[i] == 'o') {
            countO++
        }
        i++
    }

    return countO == countX && countO != 0
}

fun ehImpar(num1: Int, num2: Int): Boolean {
    val soma = num1 + num2
    return soma % 2 != 0
}
fun main() {
    println(countXO("xxoo"))
    println(countXO("xxxooo"))
    println(countXO("aa"))
    println(ehImpar(10,20))
}

fun abc(): Boolean{
    val str: String? = null
    return str!!.length == 0
    throw NullPointerException()
}

// checa maior idade:
fun maiorIdade(idade: Int): Boolean{
    return idade > 17
}