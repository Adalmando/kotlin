package override

open class Eletronico (var nome: String, var marca: String, var voltagem: String){

    private fun corrente(ativado: Boolean){}
    fun ligar(){
        corrente(true)
    }
    open fun desligar(){
        corrente(false)
    }
}

class Computador(nome: String, marca: String, voltagem: String): Eletronico(nome, marca, voltagem){
    fun save(){}

    // so posso sobreescrever uma função q seja open:
    override fun desligar(){
        save()
        // estou referenciando o desligar da classe pai usando o super:
        super.desligar()
    }

    // OverLoad: funções com mesmo nome, porém com tipos e quantidades de parametros distintos:
    fun teste(){}
    fun teste(a: Int){}
    fun teste(a: Float){}
    fun teste(a: Float, b: Float){}
    fun teste(a: String){}
    fun teste(a: Double){}


}


fun main() {
    val c = Computador("Dell Gaming", "Dell", "220V")
    c.ligar()
    c.desligar()
}