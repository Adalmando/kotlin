fun main() {
    val data = listaDeDados()
    // Não podemos somar os valores da lista data, pois não sao apenas numeros, porém em uma lista assim:
    println(listOf<Int>(1, 2, 4, 5).sum()) // o resultado é 12, util para calcular médias etc...

    // Com o SumOf(), podemos somar apenas um tipo de elemento da lista, exemplo as calorias das receitas:
    println(data.sumOf { it.calorias })
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
