package ctrl_de_fluxo.for_

fun main(){
    // EXEMPLOS DO USO DO FOR:
    for(i in 1..10){
        print("$i ")
    }

    println()

    val nome = "Adalmando Araujo"
    for(i in nome){
        print("$i ")
    }

    println()

    // STEP DIZ QUE QUERO PERCORRER A LISTA OU STRING DE 2 EM 2 INDICES, POSSO MUDAR O NUMERO TBM:
    for(i in 1..100 step 2) {
        print("$i ")
    }

    println()

    // AGORA PERCORRENDO UMA LISTA OU STRING DE TRÁS PRA FRENTE:
    for(i in 100 downTo 1 step 4){
        print("$i ")
    }
}