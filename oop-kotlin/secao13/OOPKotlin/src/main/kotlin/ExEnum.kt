// COMO CRIAR UMA CLASSE DO TIPO ENUM:
enum class AnimalEnum{
    Gato, Cachorro, Peixe, Vaca
}

// com esse val enumeracao, posso passar um valor para cada enum, como se fosse um id para elas.
enum class Prioridade(val enumeracao: Int){
    Baixa(5){
        override fun toString(): String {
            return "Prioridade baixa: $enumeracao"
        }
            },
    Media(10),
    Alta(15)
}

fun main() {
    for(p in Prioridade.values()){
        println(p)
    }
}