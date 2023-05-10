package kotlin_basico/*
Tipo    quantBits
Double  64
Float   32
Long    64
Int     32
Short   16
Byte    8
Boolean ?
String  ?
Char    ?
*/
fun main() {

    var c: Char = 'a' // aspas simples
    var s: String = "adadhiosio ffij fio"
    var b: Boolean = true

    var double: Double = 10.0
    var float: Float = 10.20f // colocando f eu forço o valor a ser um Float
    var long: Long = 100L // colocando o L eu forço o valor a ser um Long
    var int: Int = 10 // não preciso colocar nada alem do numero, pois o int é o tipo principal numerico
    var short: Short = 10
    var byte: Byte = 10

    var idade = 40 // por default qualquer numero inteiro é criado com o tipo int

    println("\nDouble MAX ${Double.MAX_VALUE}, tamanho maximo de um Double")
    println("\nFloat MAX ${Float.MAX_VALUE}, tamanho maximo de um Float")
    println("\nLong MAX ${Long.MAX_VALUE}, tamanho maximo de um Long")
    println("\nInt MAX ${Int.MAX_VALUE}, tamanho maximo de um Int")
    println("\nShort MAX ${Short.MAX_VALUE}, tamanho maximo de um Short")
    println("\nByte MAX ${Byte.MAX_VALUE}, tamanho maximo de um Byte")

}
