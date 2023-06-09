
fun main() {
    val data = listaDeDados()

    // primeiro dado adicionado na lista:
    println("Primeira receita: ${data.first()}")
    // ultimo dado adicionado na lista:
    println("Ultima receita: ${data.last()}")

    // caso eu tente usar o last e first em uma lista vazia o kotlin cai em uma exceção, para evitar isso usamos:
    println(listOf<Int>().lastOrNull()) // ou firstOrNull()
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
