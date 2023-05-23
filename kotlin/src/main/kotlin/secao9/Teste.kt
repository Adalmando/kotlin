package secao9

fun main(){
    val idade: Int = 18
    val querVotar = true


    if(idade > 17){
        println("Maior de idade!")
        if(idade > 64){
            println("Terceira idade!")
            if(querVotar){
                println("Terceira idade e quer votar!")
            }else{
                println("Vota se quiser!")
            }
        }else{
            println("Tem que votar!")
        }
    }else{
        println("Menor de idade!")
    }
}