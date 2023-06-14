package interfaces

// a diferença da interface para a classe abstrata é que ela nao pode guardar valores em variaveis,
// ela pode definir uma variavel que deve ser implementada por quem tiver contrato com ela, mas, ela
// mesma não pode guardar valores, e uma outra classe/obj pode implementar mais de uma interface.

interface Selvagem{
    val temGarra: Boolean
    fun atacar()
}

abstract class Mamifero(val nome: String){
    fun acordar(){
        println("$nome acordou")
    }
    fun dormir(){
        println("$nome dormiu")
    }
    abstract fun falar()
}

/* vamos implementar selvagem aqui, pois nem todo mamifero é selvagem*
*/
class Cachorro(nome: String) : Mamifero(nome), Selvagem{
    override val temGarra = true
    override fun falar() {
        println("$nome está falando!")
    }

    override fun atacar() {
        println("$nome está atacando!")
    }
}

fun main() {
    val c = Cachorro("Jupi")
    c.acordar()
    c.dormir()
    c.falar()
    c.atacar()
    println(c.temGarra)
}