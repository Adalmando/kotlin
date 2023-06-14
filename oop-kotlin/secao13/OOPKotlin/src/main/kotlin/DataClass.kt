fun main() {

}


class Forma (val a: Int, val b: Int)

// funciona como uma classe normal, porém o toString e o Equals ja vem prontos, não precisam ser feitos a mão
// e existe um metodo copy() que permite copiar uma instancia dessa classe para outra, ex: f1 = f2.copy()
// OBS: Usamos o equals pra fazer comparação se um objeto tem os atributos com mesmos valores de atributos de outro
// objeto, EX: pessoa1.equals(pessoa2) => return boolean
data class FormaData(val a: Int, val b:Int)

data class Endereco(val cidade: String, val rua: String, val numero: Int)

// Aqui podemos criar um metodo passando como parametro uma instancia de classe, assim evitando muito código usando apenas
// e: Endereco:
fun calculaRota(e: Endereco){

}