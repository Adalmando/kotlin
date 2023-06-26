fun main() {
    val data = listaDeDados()

    // O método filter funciona como uma query qualquer num banco de dados, porém dentro do kotlin,
    // posso filtrar uma lista de receitas por exemplo por nome, eu digo o nome da receita e o filter
    // trás todas com aquele nome:
    println(data.filter { it.nome == "Panqueca" })

    // posso fazer uma busca por receitas que tenham mais de 500 calorias:
    println(data.count { it.calorias > 500 })

    // também posso fazer isso com o any, para saber se existem receitas com mais de 500 calorias:
    println(data.any { it.calorias > 500 })
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