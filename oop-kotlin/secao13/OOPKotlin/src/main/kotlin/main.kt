class Animal(var especie: String){

    // por padrão o atributo nome tem getter e setter publico, mas se eu deixa-lo private não!
    var nome: String? = null


    // ATRIBUTO DEFAULT 1, MAS PODE SER MUDADO SE EU PASSAR OUTRO VALOR NA INSTANCIA DO OBJETO:
    var idade: Int = 1
        private set // isso impede que idade tenha um setter publico, ou seja, so pode ser editado aqui na classe

    // CONSTRUTOR SECUNDÁRIO, QUANDO EU TENHO REGRAS NA CONSTRUÇÃO DO OBJETO OU QUANDO UM ATRIBUTO DEFAULT FOR
    // PASSADO NA INSTANCIA DE UM OBJETO, OU SEJA O DEFAULT MUDA PARA O QUE EU PASSAR DELE:
    constructor(especie: String, nome: String, idade: Int): this(especie = especie){
        this.nome = nome
        this.idade = idade
    }

    init {
        som()
    }

    fun som(){
        return if(especie == "cachorro"){
            println("Au au")
        } else if(especie == "gato"){
            println("Miau miau")
        } else{
            println("Som de ${especie}")
        }
    }
}

class Pessoa (val anoNascimento: Int, var nome: String){
    var doc: String? = null

    constructor(anoNascimento: Int, nome: String, doc:String) : this(anoNascimento, nome){
        this.doc = doc
    }
    fun dormir(){
        println("Dormindo")
    }

    fun acordar(){
        println("Acordado")
    }
}

fun main() {
    val p = Pessoa(2001,"Adalmando", "29219409u90u2")

}

