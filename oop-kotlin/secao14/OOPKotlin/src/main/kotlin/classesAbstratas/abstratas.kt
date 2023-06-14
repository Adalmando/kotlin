package classesAbstratas

// uma classe abstrata tem que ter pelo menos um metodo ou variavel abstrata,
// e eles devem ser implementados na classe que herda ela!

abstract class Mamifero(val nome: String){
    fun acordar(){
        println("$nome acordou")
    }
    fun dormir(){
        println("$nome dormiu")
    }
    abstract fun falar()
}


class Cachorro(nome: String) : Mamifero(nome){
    override fun falar() {
        println("$nome está falando!")
    }
}

fun main() {
    val c = Cachorro("Jupi")
    c.acordar()
    c.dormir()
    c.falar()
}