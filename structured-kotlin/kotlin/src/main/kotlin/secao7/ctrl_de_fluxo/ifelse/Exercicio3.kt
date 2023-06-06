package ctrl_de_fluxo.ifelse

fun main(){
    // Escreva um programa para ser usado na portaria de um evento.

// a. Peça a idade. Menores de idade não são permitidos. Mensagem: “Negado. Menores de idade não são
// permitidos.”.


// b. Peça o tipo de convite. Os tipos de convite são comum, premium e luxo. Negar a entrada caso não seja nenhum
// destes. Mensagem: “Negado. Convite inválido.”.



// c. Peça o código do convite. Convites premium e luxo começam com “XL”. Convites comuns começam com “XT”.
// Caso o código não esteja nos padrões, negar a entrada. Mensagem: “Negado. Convite inválido.”.



// d. Caso todos os critérios sejam satisfeitos, exibir “Welcome :)”.
    var cont: Int = 0

    print("Digite sua idade: ")
    var idade = readLine()

    if(idade != null && idade != ""){
        if(idade.toInt() <18){
            println("Negado. Menores de idade não são permitidos.")
        }
        else{
            println("Autorizado. Maiores de idade são permitidos.")
            cont++
        }
    }

    print("Informe seu tipo de convite: comum, premium ou luxo: ")
    var tipo = readLine()

    if(tipo == "comum" || tipo == "premium" || tipo == "luxo"){
        println("Autorizado. Convite válido")
        cont++
    }else{
        println("Negado. Convite inválido")
    }

    print("Informe o código do convite: ")
    var codigo = readLine()

    if(codigo != null && codigo != "") {
        if (codigo.startsWith("XL", true) || codigo.startsWith("XT", true)) {
            println("Autorizado. Convite válido")
            cont++
        } else {
            println("Negado. Convite inválido")
        }
    }

    if(cont == 3){
        println("Welcome :")
    }
}