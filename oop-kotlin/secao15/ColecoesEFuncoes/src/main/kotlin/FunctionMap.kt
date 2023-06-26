fun main() {
    val data = listaDeDados()

    //o filter retorna dados filtrados de uma lista:
    data.filter { it.nome != null }.forEach{ println(it.nome) }

    // Mas o map cria uma lista com os dados filtrados e voce pode transformar esses dados em outra lista:
    println(data.map { it.nome }) // isso se tornou uma nova lista com os nomes das receitas

    // também posso criar uma val para guardar o total de calorias de todas as receitas:
    val total = data.map { it.calorias }.sum()
    println(total)
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