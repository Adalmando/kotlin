package secao9

fun main(){
    portaria()
}

fun portaria() {
    print("Qual a sua idade: ")
    val idade = readLine()

    if(idade != null && idade != ""){
        if(idade.toInt() < 18){
            println("Negado. Menores de idade não são permitidos.")
            return
        }
    }
    print("Qual é o tipo do convite? ")
    var tipoConvite = readLine()

    if(tipoConvite != null && tipoConvite != ""){
        tipoConvite = tipoConvite.lowercase()

        // Validação de tipo de convite:
        if(tipoConvite != "comum" && tipoConvite != "premium" && tipoConvite != "luxo"){
            println("Negado. Convite inválido,")
            return
        }

        print("Qual o código do convite? ")
        var codigo = readLine()

        if(codigo != null && codigo != ""){
            codigo = codigo.lowercase()

            if(tipoConvite == "comum" && codigo.startsWith("xt")){
                println("Welcome :)")
            }else if ((tipoConvite == "premim" || tipoConvite == "luxo") && codigo.startsWith("xl")
                ){
                println("Welcome :)")
            } else{
                println("Negado. Convite inválido")
            }
        }
    }

}