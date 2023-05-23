package secao8

// O kotlin não permite criar uma variavel com valor null, a menos que coloquemos '?' depois do seu tipo, ex:
// String? Int? Boolean? Caso os valores adicionados nos campos sejam nulos o kotlin trata o nullpointer para nós!
// Esse é o conceito de Null Safety
fun main(){


    print("Digite o seu nome: ")
    var nome = readLine() // o readline recebe um parametro String? pois o kotlin nao sabe se o valor passado vai ser null ou não
    println(nome?.length)


    // O kotlin não permite criar uma variavel com valor null dessa forma:
    //var nome: String = null
    //println(nome.length)

    // Porém quando fazemos assim ele aceita valor null:

    var nomeDois: String? = null

    // Quando usamos o '?' significa que estamos querendo usar uma variável
    // que pode ser nula e se ela for nula o kotlin trata!

    println(nomeDois?.length)

    // Quando usamos o '!!' significa que estamos querendo usar uma variável
    // que pode ser nula e se ela for nula a gente ja tem esse erro tratado ou
    // sabe que a variavel não vai cair em exceção, ou seja, o kotlin não vai
    // tratar pra gente, se não tratarmos o kotlin vai retornar um nullPointer!

    println(nomeDois!!.length)

    // Perceba que quando printamos o lenght da variavel nula o kotlin não
    // deu erro de nullPointerException! Ele apenas retornou um null!!!
    // Ou seja o kotlin tratou esse null!
}