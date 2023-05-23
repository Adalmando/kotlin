package secao8

fun main() {

    val str: String? = "adalmando"

    // Como checar se é nulo para depois realizar alguma instrução:
    if(str != null){
        println("$str Não é null by if")
    }

    // Como fazer o mesmo utilizando o let:
    str?.let {
        // corpo do let, só será execultado o que tiver aqui se o srt não for null:
        // dentro do scopo do let, a variavel que eu estou utilizando no caso o str, recebe o apelido de
        // it, semelhante ao this em java, por isso posso referenciar ela assim:
        println("$it Não é null by let")
    }
}