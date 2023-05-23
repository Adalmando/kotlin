package ctrl_de_fluxo// PRIORIDADE DE EXECUÇÃO DE COMPARADORES:
// 1. Parentesis ()
// 2. Negação ! - não
// 3. Conjunção && - e
// 4. Disjunção || - ou


// Operador de intervalo (range):
fun main(){

    val n: Int = 170

    if(n >=1 && n<=50){
        println("$n esá entre 1 e 50!")
    }else{
        println("$n não está entre 1 e 50!")
    }

    // Outra forma de fazer isso:
    if(n in 1..50){
        println("$n está entre 1 e 50!")
    }else{
        println("$n não está entre 1 e 50!")
    }

}