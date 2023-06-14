package heranca

// a classe que vai ser pai/mãe de outras classes deve começar com open
// por default, classes e metodos são public, mas temos outros 2 tipos:
// private: somente o escopo da classe, função pode acessar algo privado.
// protected: somente classes que herdam da classe protegida podem acessar algo protegido!
open class Eletronico (var nome: String, var marca: String, var voltagem: String){
    // somente metodos da classe eletronico podem acessar ativar corrente:
    private fun ativarCorrente(){}

    // somente classes que herdarem eletronico podem aacessar fun ligar:
    //OBS: instancias de classes filhas não podem acessar ligar, ver exemplo abaixo
    protected fun ligar(){
        ativarCorrente()
        return println("$nome está ligado(a)!")
    }
    fun desligar(){
        return println("$nome está desligado(a)!")
    }
}

// dessa forma criamos uma classe que herda de outra:
class Computador(nome: String, marca: String, voltagem: String): Eletronico(nome, marca, voltagem){
    fun jogar(){
        // exemplo
        ligar()
        return println("$nome está rodando um jogo!")
    }

}


fun main() {
    val c1 = Computador("Azus gaming", "Azus", "220V")
    c1.jogar()
    c1.desligar()
    // não posso fazer isso: c1.ligar()
}