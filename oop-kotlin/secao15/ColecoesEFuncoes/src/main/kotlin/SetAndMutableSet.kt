fun main() {
    // Diferente de um List o Set não armazena os valores em uma sequencia expecifica ou por
    // ordem de adição, e o Set aceita valores duplicados mas eles ficam na mesma posição de memoria, sendo apenas 1!

    val set1: Set<String> = setOf<String>("Paris", "Madrid", "Berlim", "Berlim")
    // Se tiver valor repetido no print so aparece uma vez! ou seja, eles ocupam o mesmo endereço de memoria!
    println(set1)
    // digitando set1 e colocando ponto, vejo todos os metodos que um Set possui!

    // criando um set q pode ser mutavel:
    val set2: MutableSet<String> = mutableSetOf("New York", "London", "Turquia")
    set2.add("Nova Zelandia")
    set2.add("Nova Zelandia")
    set2.add("Nova Zelandia")
    println(set2)

    // OBS: Set não tem index, nao tem ordem certa, e os valores repetidos são armazenados como sendo um só!

}