package ctrl_de_fluxo.ifelse

fun maiorIdade(idade: Int){
    if(idade >17){
        if(idade > 59){
            println("Maior idade!")
        }else{
            println("Maior de idade!")
        }
    }

    else if(idade < 11){
        println("Criança")
    }
    else{
        println("Menor de idade!")
    }
}

fun main(){
    maiorIdade(10)
}