fun main() {
    val data = listaDeDados()

    val lista = listOf<Int>(12, 2, 2, 4, 2,4, 4, 2,4)
    println(lista.distinct()) // funciona como em sql o distinct

    // estou printando o nome das receitas mas estou distinguindo por nome, não pego duas receitas com o mesmo nome
    println(data.distinctBy { it.calorias}.map { it.nome })

    println(lista.sorted()) // ordena os dados da lista em ordem crescente
    println(lista.sortedDescending()) // ordena os dados da lista em ordem decrescente

    println(lista.reversed()) // reverte a ordem dos elementos da lista

}

private fun listaDeDados(): List<Receita> {

    return listOf(
        Receita("Lasanha", 1200, listOf(
            Ingrediente("Presunto", 5),
            Ingrediente("Queijo", 10),
            Ingrediente("Molho de tomate", 2),
            Ingrediente("Manjerição", 3)
        )
        ),
        Receita("Panqueca", 500),
        Receita("Omelete", 200),
        Receita("Parmegiana", 700),
        Receita("Sopa de feijão", 300),
        Receita("Hamburguer", 2000, listOf(
            Ingrediente("Pão", 1),
            Ingrediente("Hamburguer", 3),
            Ingrediente("Queijo", 1),
            Ingrediente("Catupiry", 1),
            Ingrediente("Bacon", 3),
            Ingrediente("Alface", 1),
            Ingrediente("Tomate", 1)
        )
        )
    )
}