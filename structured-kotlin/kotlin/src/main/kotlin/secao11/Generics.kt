package secao11

fun main(){
    println(mediaVarArgs(10f,8f,9f, true, false, "sdkasdasda"))
}

// como declarar um tipo generico: posso dar a ele qualquer apelido: T A Q R:
// Aquim, minha função aceita valores genericos, na chamada dela posso passar qualquer tipo de valor
// que ela vai pegar apenas os float e fazer o calculo da media:
fun <T, F> mediaVarArgs(abc: F, vararg notas: T): Float{
    var somas = 0f
    var cont= 0
    if(abc is Float) {
        somas += abc
        cont ++
    }
    for(n in notas){
        if(n is Float){
            somas += n
            cont++
        }
    }

    return somas/cont
}