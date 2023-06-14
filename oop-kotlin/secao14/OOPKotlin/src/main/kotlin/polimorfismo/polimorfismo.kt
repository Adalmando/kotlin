package polimorfismo


interface Funcionario{
    val salario: Float
    fun bonus(): Float
}
class Gerente(override var salario: Float) : Funcionario{
    override fun bonus(): Float {
        return salario * 0.5f
    }
}
class Analista(override val salario: Float) : Funcionario{
    override fun bonus(): Float {
        return salario * 0.3f
    }
}

fun mostraBonus(f: Funcionario){
    return println("O bonus é de R$ ${f.bonus()}")
}

fun main() {
    mostraBonus(Gerente(5000f))
    mostraBonus(Analista(2000f))
}