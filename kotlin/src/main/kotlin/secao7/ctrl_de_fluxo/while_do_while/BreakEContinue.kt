package ctrl_de_fluxo.while_do_while

fun main(){

    // a variavel que irá contar o loop não pode estar dentro do while, caso contrario
    // toda vez que o while rodar novamente ela vai ser inicializada com o valor inicial
    // deixando o loop infinito!
    var cont = 0

    // dessa forma o while nunca irá sair do loop, a menos que usemos dentro do bloco de instruções
    // o break:
    while(true){
        if(cont > 50){
            break
        }
        print("$cont ")
        cont++
    }

    // o break pode ser util quando eu tiver que varrer uma lista ou string muito longa em busca de algo específico
    // e quando eu achar o que eu quero não existe motivo para continuar percorrendo o array ou string:
    // ex: quero saber se nessa longa string existe um "%":
    val teste: String = "daiokfhasiohfndiosghwed" +
            "iongoekngoefnkeiofhjnioefdhjdf" +
            "kohjdfgiobkjrhorothriohr" +
            "%sdkjlgnsdighsdhjkgsdhjgkjs" +
            "dfnvdfnlgkk.dfb"

    println()
    var contador: Int = 0
    for(index in teste){
        if(index == '%'){
            println("$index está no índice $contador.")
            break
        }
        contador++
    }

    // CONTINUE: ele indica que o que tiver abaixo dele deve ser ignorado e o loop reiniciado como se ele fosse
    // o ponto final do loop, ele funciona como um break porém ele não faz com que o laço seja encerrado, ele
    // apenas faz com que o laço se repita novamente apartir dele, como um delimitador.
    var i: Int = 0
    while(i<=80){

        // aqui estou incrementando i até chegar em 50, quando ele chegar em 50 ele vai ignorar o continue,
        // e vai avançar para a proxima etapa que é a etapa de printar na tela o i!
        if(i<50){
            i++
            continue
        }
        // quando o i atingir o valor 80 o while finaliza automaticamente!
        print("$i ")
        i++
    }


}