import org.junit.jupiter.api.*

class MainTest {

    @Test // indica que isso aqui é um teste:
    @DisplayName("Teste metodo XXOO") // anotação somente para organizar os nomes dos testes
    fun testCountXO(){
        // DESSA FORMA SE UM DOS TESTES NÃO PASSAR A EXECUÇÃO DO PROGRAMA PARA, COMO SE FOSSE UMA EXCEÇÃO
        // NÃO TRATADA:
        Assertions.assertTrue(countXO("xxoo")) // espera que o resultado do método COUNTXO seja true, existe também o assertFalse q faz o contrário.
        Assertions.assertEquals(countXO("xxo"), false) // coloco o método e o que eu espero dele, pode ser numerico, string ou booleano
    }

    @Test
    @DisplayName("Teste metodo ehImpar")
    fun testImpar(){
        // QUANDO EU USO O ASSERTALL, O PROGRAMA NÃO PARA QUANDO CHEGAR EM UM TESTE QUE NÃO PASSA:
        Assertions.assertAll(
            { Assertions.assertTrue(ehImpar(10,1)) },
            { Assertions.assertFalse(ehImpar(7, 7))},
            { Assertions.assertEquals(ehImpar(7,6), true)}
        )
    }

    @Test
    @Disabled // SIGNIFICA QUE QUERO IGNORAR ESSE TESTE, OU SEJA, SE TIVER ERRADO ELE NÃO ACUSA!
    fun naoImplementado(){

    }

    @Test
    @DisplayName("Teste falho!")
    // serve para deixar de lembrete: "termine-me!"
    fun vaiFalhar(){
        fail(message = "Esse teste é o ultimo a ser implementado, deixei ele falho" +
                "para não esquecer de finalizar ele após terminar todos os outros.")
    }

    @Test
    @DisplayName("Assume true")
    fun assumption(){
        // AssumeTrue significa que eu assumo que esse primeiro teste tem que ser true para que o segundo seja executado:
        Assumptions.assumeTrue(countXO("xxoo"))

        // Esse teste so é executado se o primeiro for o que eu espero, ou seja, true:
        Assertions.assertTrue(ehImpar(1,2))
    }

    @Test
    fun exception(){
        // assertThrows <TipoDaExcecao> indica que eu espero que uma exceção seja lançada, independente dela estar tratada ou não:
        // se o metodo lançar uma exceção, o teste é satisfeito!
        assertThrows<NullPointerException> { abc() }
    }

    @Test
    fun provocacao(){
        Assertions.assertNotNull(countXO("aaaooxx"))
    }

    @Test
    fun testIfElse(){
        Assertions.assertTrue(maiorIdade(29))
    }
}
