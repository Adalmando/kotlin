package ctrl_de_fluxo.while_do_while

fun main(){

    // WHILE FUNCIONA IGUAL O DO JAVA, RECEBE UM PARAMETRO BOOLEAN E SO PARA O LOOP QUANDO O BOOLEAN VIRA FALSE:
    var cont = 1
    while(cont<=100){
        print("$cont ")
        cont++
    }

    // DO WHILE FUNCINA IGUAL O WHILE, PORÉM ELE EXECUTA O CODIGO PELO MENOS 1 VEZ ANTES DE VER A CONDIÇÃO:
    do{
        println("Digite o seu nome: ")
        var nome = readLine()
    } while(nome == "")
    // nesse codigo ele pede primeiro o nome, se não for informado, ele pede denovo até o nome ser digitado!

}