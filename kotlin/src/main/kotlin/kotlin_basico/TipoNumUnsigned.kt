package kotlin_basico

// tipo unsigned ao final do numero eu coloco a assinatura u, que diz que o numero
// é um unsigned, não pode ser negativo e na declaração de tipo numérico eu coloco um
// U antes ex: Int -> UInt, float e double não podem ser unsigned.
fun main() {
    val abc: UInt = 0u
    val short: UShort = 10u
    val byte: UByte = 10u
    val long: ULong = 10u

    // Agora vejamos quais os valores maximos que um numero unsigned pode guardar:
    println("ULong MAX - ${ULong.MAX_VALUE} - ULong MIN - ${ULong.MIN_VALUE}")
    println("UInt MAX - ${UInt.MAX_VALUE} - UInt MIN - ${UInt.MIN_VALUE}")
    println("UShort MAX - ${UShort.MAX_VALUE} - UShort MIN - ${UShort.MIN_VALUE}")
    println("UByte MAX - ${UByte.MAX_VALUE} - UByte MIN - ${UByte.MIN_VALUE}")
}
