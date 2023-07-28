interface EventListenerKotlin{
    fun click()
}

class Form{
    fun clickJava(e: EventListenerJava) {}
    fun clickKotlin(e: EventListenerKotlin) {}
}

/**A classe anonima não consegue acessar as variaveis e metodos da classe na qual ela está inserida,
    já a função anonima consegue acessar tudo isso! E a diferença maior entre elas é que uma é função
    anonima e a outra é uma classe anonima!**/

class Main{

    fun main(){

        /**Implementação do click java feito com função anonima!
        OBS: So consigo usar funcao anonima se a interface tiver apenas um metodo
        e se a interface for java, caso eu adicione mais um metodo click2 em eventListenerJava
        ele nao vai deixar eu implementar a interface usando funcao anonima, apenas uma classe anonima!**/
        Form().clickJava {}

        Form().clickKotlin(object : EventListenerKotlin{
            override fun click(){
            }
        })
    }
}