package secao8

import java.lang.Exception

// Tratando exceção: Try = tente rodar isso. Catch = capturar, capture possiveis excecoes ao tentar rodar!
// em um try catch eu posso ter varios catchs capturando exceções distintas!
// Uma dica para saber que tipo de exceção nosso código irá retornar é executar ele antes de tratar e ai
// saberemos o que temos que tratar, ex: NullPointer, ArithmeticException, ArrayOfBound... Etc.
// Temos o ultimo bloco também que é o finally: Ele é execultado sempre após os catchs, independente de tudo
// dentro dele passamos instruções que devem ser executladas ao final das exceções, exemplo, quando tentamos
// fazer qualquer operação com banco de dados e ela falha, ao final do processo devemos colocar no finally, que
// a conexão com o banco deve ser fechada, para evitar possiveis erros futuros, ou seja, deu erro, db.close!
// Obs: quando caimos em uma exceção, mesmo ela sendo tratada, o código para, execulta depois apenas o que tiver no finally!
fun main(){

    // So cai no catch o erro que passar primeiro no try, os demais são ignorados e vai direto pro finally
    //o finally é opcional
    try{
        return //mata toda instrução que tiver abaixo do return, funciona quase como um break/continue
        val s: String? = null
        println(s!!.length) // Exceção de nullpointerException!
        println(10/0) // Exceção de divisão por 0!
    }catch (e: NullPointerException){
        println("Vaiável nula!")
    }catch (e: ArithmeticException){
        println("Impossível dividir por zero!")
    } catch (e: Exception){
        println("Exceção genérica, não sei o erro que caiu mas eu tratei mesmo assim!")
    }
    finally {
        println("Finally!")
    }
    println("Fim!")
}