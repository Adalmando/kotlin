fun main() {

    println("Olá, mundo!")

    // Se eu declaro a variavel e já instancio um valor para ela, não preciso
    // dizer qual é o seu tipo, pois o compilador ja presume:
    var nome = "Adalmando"

    // Se eu apenas declaro sem instanciar, tenho que dizer o tipo, pois
    // o compilador não tem como saber o que a variável vai receber.
    var nomeDois:String

    nomeDois = "Araújo"

    println("${nome} ${nomeDois}")

}