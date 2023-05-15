package ctrl_de_fluxo.for_

fun main(){
    // CONTAR NA MSM LINHA 1 A 50
    for(i in 1..50){
        print("$i ")
    }
    println()

    // CONTAR NA MSM LINHA 50 A 1
    for(i in 50 downTo 1){
        print("$i ")
    }

    println()
    // 1 A 50 SEM OS MULTIPLOS DE 5
    for(i in 1..50){
        if(i%5==0){
            continue
        }
        print("$i ")
    }

    println()
    // SOMA DE TODOS OS NUMEROS DE 1 A 500
    var cont = 0
    for(i in 1..500){
        cont+=i
    }
    println(cont)

    print("digite o numero: ")
    var entrada = readLine()
    var numero: Int

    if(entrada != null && entrada != ""){
        numero = entrada.toInt()

        for(i in 1..numero){
            for(j in 1..i){
                print("#")
            }
            println()
        }
    }

}