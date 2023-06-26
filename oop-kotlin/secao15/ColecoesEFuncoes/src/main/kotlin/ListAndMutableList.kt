fun main() {

    // List

    // List não pode mudar depois de sua criação
    var lst1 : List<Int> = listOf(1, 2, 3, 4, 5)
    

    // A MutableList pode ser moldada depois de criada:
    val list2 : MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)

    list2.add(6)
    for(n in list2){
        println(n)
    }
    list2.removeAt(5)
    list2[1] = 32
    for(n in list2){
        println(n)
    }


}