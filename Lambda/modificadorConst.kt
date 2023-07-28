/**
Top level declaration (declaração acima do escopo de classe ou classes: declaro fora das classes uma constante que pode
ser acessada de todas as classes que estiverem no arquivo:)
 Usamos muito o const val para guardar valores que são imutáveis e que iniciem junto com a compilação, ou seja, são "variaveis"
 que não dependem de tempo de execução para serem criadas!
 **/
const val NUM_1 = 10


// a fun main acessando a const de escopo top Level:
fun main() {
    println("O valor da const de escopo top level é $NUM_1!")
    teste()
    println(NUM_1.type())
}

// Uma função acessando uma const de escopo top Level:
fun teste(){
    println("O valor da const de escopo top level é $NUM_1!")
}


// Uma outra classe acessando uma const de escopo top Level:
class Teste{
    val teste = NUM_1
}