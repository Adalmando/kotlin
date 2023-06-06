package kotlin_basico// var é uma variável, pode ter o seu valor alterado, mas o val possui valor constante:

fun main() {

    // Como o nome é um var, ele pode ser alterado posteriormente:
    var nome: String = "Adalmando"
    nome += " Araújo"
    println(nome)

    // Como sobrenome é um val, ele não pode ser alterado posteriormente:
    val sobreNome = "Silva"

    // sobreNome = "Sousa" Kotlin: Val cannot be reassigned

}
