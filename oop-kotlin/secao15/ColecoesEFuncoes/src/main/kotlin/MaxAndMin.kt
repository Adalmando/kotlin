fun main() {
    val data = listaDeDados()
    // OBS: ao final de cada metodo desses posso usar o ORNull para tratar exceção se a lista tiver vazia!
    println(data.maxOf { it.calorias }) // printa calorias da receita com mais calorias
    println(data.minOf { it.calorias }) // printa calorias da receita com menos calorias
    println(data.maxByOrNull { it.calorias }) // printa o objeto ointeiro com maior calorias!

    println(listOf<Int>(1, 2, 4, 5, 0).max())  // printa o maior valor de uma lista
    println(listOf<Int>(1, 2, 4, 5, 0).min()) // printa o menor valor de uma lista
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