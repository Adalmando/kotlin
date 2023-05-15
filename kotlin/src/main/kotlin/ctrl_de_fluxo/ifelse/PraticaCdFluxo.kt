package ctrl_de_fluxo.ifelse

/**
1
Escreva um programa para ajudar a empresa XPTO calcular o bônus que os funcionários receberão no ﬁnal
do ano. Os bônus são classiﬁcados por cargo.

a. Gerentes recebem R$ 2.000,00
b. Coordenadores recebem R$ 1.500,00
c. Engenheiros de software recebem R$ 1.000,00
d. Estagiários recebem R$ 500,00

2
Modiﬁque o primeiro exercício para considerar o tempo de experiência no cálculo de bônus.

a. Gerentes com menos de 2 anos de experiência recebem R$ 2.000,00, caso contrário recebem R$ 3.000,00
b. Coordenadores com menos de 1 ano de experiência recebem R$ 1.500,00, caso contrário recebem R$ 1.800,00
c. Engenheiros de software recebem R$ 1.000,00
d. Estagiários recebem R$ 500,00
 **/
fun calcSalario(cargo: String, experiencia: Int): Float{

    if(cargo == "gerente"){if(experiencia<2){return 2000.0f}else{return 3000.0f}}

    else if(cargo == "coordenador"){if(experiencia <1){return 1500.0f}else{return 1800.0f}}

    else if(cargo == "engenheiro"){return 1000.0f}

    else if(cargo == "estagiario"){return 500.0f}else{return 0f}
}

fun main(){
    println(calcSalario("gerente", 5))
}