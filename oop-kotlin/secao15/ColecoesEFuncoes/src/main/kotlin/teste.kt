fun main() {
    filter()

}

fun filter() {
    val mList = setOf("Curso", "Desenvolvedor", "Kotlin", "Coleções", "Curso")
    mList.filter { it.startsWith("C") }.forEach { print(it) }
}