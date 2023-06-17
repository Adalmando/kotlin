package classeAnonima

interface Event{
    fun onSuccess()
}

class Programa(){
    fun salvar(e: Event){
        println("Abrindo conexão.")
        println("Salvando valores.")
        println("Sucesso. Conexão fechada.")
        e.onSuccess()
    }
}

// observe que estou criando uma classe evento apenas para implementar um metodo da interface event, mas, eu não
// poderia fazer essa implementação tão pequena apenas dentro do escopo onde vou usar ela? no metodo salvar()?
class Evento : Event{
    override fun onSuccess() {
        println("onSuccess!")
    }
}

fun main() {
    val p = Programa()
    val e = Evento()
    p.salvar(e)

    // uma forma de implementar uma interface de forma rapida e localizada é usando classe anonima:
    val p1 = Programa()
    p1.salvar(object : Event{
        override fun onSuccess() {
            println("onSuccess by anonymous class!")
        }
    })
}