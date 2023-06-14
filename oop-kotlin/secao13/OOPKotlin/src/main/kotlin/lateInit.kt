import jdk.management.jfr.RecordingInfo

// Inicialização tardia:
// quando usamos lateinit dizemos que essa variaval não vai ser inicializada agora mas que garantimos
// que ela vai ser inicializada depois, com isso não precisamos usar o String? = null ou o String = ""
// Porém, se não incializarmos ela posteriormente, e o kotlin tentar acessar ela, iremos cair em uma exceção!

class Receita{
    lateinit var instrucoes: String
    // podemos inicializar ela por meio de funções:

    fun geraReceita(){
        instrucoes = "Lave bem as mãos!"
    }

    fun imprimeReceita(){
        if(!this::instrucoes.isInitialized){
            geraReceita()
        }
    }
}

fun main() {
    val r = Receita()
    r.geraReceita()
    // note que se eu não usasse a função geraReceita antes do print ia da uma exceção:
    println(r.instrucoes)

    val r1 = Receita()
    r1.imprimeReceita()
    println(r1.instrucoes)
}