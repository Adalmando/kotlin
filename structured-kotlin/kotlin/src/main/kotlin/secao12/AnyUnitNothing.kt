package secao12

fun main(){
    println(valores(12312312))
    println(valores(1231231.2))
    println(valores("safasfasfaf"))
    println(semRetorno(12312312))
    println(valoresDois("sadfasfas"))
    usandoNothing(1,2)
}

// Any é qualquer tipo, ou seja, a função valores aceita por parametro qualquer tipo de dado, String, int, double...
fun valores(value: Any): Any{
    return value
}

// Generics funciona igual:
fun <N> valoresDois(valores: N): N{
    return valores
}

// também podemos colocar o tipo de retorno da função : Unit, mas se não colocar ele ja sabe que é unit.
fun semRetorno(num: Int){
    1+2 // pode até fazer uma operação mas não retorna nada
    // sem retorno
}


// serve para deixar um método que não ta pronto "marcado" com uma exceção q lança a mensagem do TODO!
fun usandoNothing(n: Int, n2: Int): Nothing{
    TODO("Ainda não implementei esse método")
}