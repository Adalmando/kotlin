

fun main() {
    val pessoaCriadaParaTestes = Pessoa(2000, "Fulano", "282497192")

    // usamos o with quando precisamos passar muitos metodos e atributos de uma instancia de objeto
    // cujo nome ficou muito grande para evitar nomeObjeto.metodo ou nomeObjeto.atributo fazemos assim:

    with(pessoaCriadaParaTestes){
        println(nome)
        println(anoNascimento)
        println(doc)
        acordar()
        dormir()
    }
}

