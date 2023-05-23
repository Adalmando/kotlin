package secao7
/*
* Ana e Paula são duas programadoras da empresa XDM. A empresa XDM possui um benefício para incentivar os
* funcionários a pouparem dinheiro para a aposentadoria que funciona da seguinte maneira:
* Se o funcionário destinar 5% do seu salário para o investimento, a empresa acrescenta o mesmo valor.
* Ou seja, caso o funcionário invista 100 reais, a empresa investe mais 100.
* Este fundo de investimento possui rendimento de 0,2% ao mes.
*
* Ana adorou a ideia e vai investir. No entanto, Paula decidiu que vai investir os mesmos 5% por conta própria
* já que conhece investimentos que rendem mais que 0,2% ao mes. Paula vai escolher investimentos que rendem 0,8%
* ao mes. Considere o salário de Ana e Paula iguais e no valor de 10 mil reais e que as duas estão começando com
* o saldo 0 e que investirão 5% do salário.
*
* Em quantos meses o patrimônio de Paula vai superar o patrimônio de Ana?*/

fun main(){

    val salario: Float = 10000f
    var ana: Float = 0f
    var paula: Float = 0f
    var count: Int = 0

    do {
        ana += (ana*0.002f) + (salario*0.05f) + (salario*0.05f)
        paula += (paula*0.008f) + (salario*0.05f)
        count ++

        }while(ana>paula)

    println("O rendimento de Paula passou o de Ana no ${count}º mês!")
}