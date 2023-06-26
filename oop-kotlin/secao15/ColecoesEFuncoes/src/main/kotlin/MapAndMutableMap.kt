fun main() {

    // O map é uma coleção do tipo chave e valor
    // ele aceita valores diferentes para a mesma chave, porém somente o ultimo valor atribuido aquela
    // chave vai contar na hora de printar ou chamar o valor pela chave:

    val map1 = mapOf<Int, String>(Pair(1, "adalmando"),Pair(2, "teste"), Pair(2, "valorNaMesmaChave") )
    println(map1) // observe que a chave 2 não está mais atribuida para teste e sim para valornamesmachave!
    println(map1.keys) // imprime as chaves<<
    println(map1.values) // imprime todos os valores
    println(map1.get(2)) // printando um valor pela chave!

    val map2 = mutableMapOf<Int, String>(Pair(0, "Brasil"))
    println(map2)
    map2[0] = "Brasilia" // posso mudar o valor na chave 0 pois é uma mutableMap!
    println(map2)
}