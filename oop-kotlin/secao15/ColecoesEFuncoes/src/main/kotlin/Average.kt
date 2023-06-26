fun main() {
    val data = listaDeDados()

    // Average serve para calcular a media de uma lista de numeros:
    println(data.map { it.calorias }.average())// calculando a media das calorias das receitas
    println(listOf<Int>(12, 2,4).average())
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