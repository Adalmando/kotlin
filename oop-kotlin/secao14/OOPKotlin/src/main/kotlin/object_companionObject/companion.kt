package object_companionObject

class Matematica{

    // Assim crio variaveis e metodos com scopo estatico:
    // para usar as variaveis e metodos estaticas não preciso instanciar a classe que ele pertence:
    companion object{
        val PI = 3.1415
        fun soma(a: Int, b: Int): Int{
            return a+b
        }
    }

    // funciona como o compaion, porém ele requer um nome, e posso criar mais de um:
    object obj1{
        val PI = 3.1415
        fun soma(a: Int, b: Int): Int{
            return a+b
        }
    }
}

fun main() {
    // metodos com escopo estatico so podem ser acessados dessa forma, sem a instancia da classe:
    println(Matematica.PI)
    println(Matematica.soma(1,2))

    // dessa forma não consigo acessar o valor de PI, pois ele tem escopo de classe e não de objeto:
    val m = Matematica()
    // aqui da erro: m.PI
}