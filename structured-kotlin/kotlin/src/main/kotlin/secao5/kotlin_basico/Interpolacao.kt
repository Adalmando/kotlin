package kotlin_basico

fun main() {

    println("Olá, mundo!")

    // Se eu declaro a variavel e já instancio um valor para ela, não preciso
    // dizer qual é o seu tipo, pois o compilador ja presume:
    var nome = "Adalmando"

    // Se eu apenas declaro sem instanciar, tenho que dizer o tipo, pois
    // o compilador não tem como saber o que a variável vai receber.
    var nomeDois:String

    nomeDois = "Araújo"

    // para uma interpolação simples usamos $variavel:
    println("Olá, $nome!")
    println("Seu sobrenome é $nomeDois.")

    // para uma interpolação com alguma funcionalidade, usamos ${variavel + variavel, etc...}:
    println("Seu nome completo é ${nome +" "+nomeDois}")
}