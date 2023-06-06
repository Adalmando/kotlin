package secao11

fun main() {

    println(endereco("Arlindo francisco", "nova olinda", "paraiba", "58798000"))
}

// ao deixar o parametro num setado em 0, caso o usuario não insira valor nele, ele vai ficar 0:
fun endereco(rua: String, cidade: String, estado: String, cep: String, num: Int = 0): String{
    return "rua: $rua, cidade: $cidade, estado: $estado, cep: $cep, num: $num"
}