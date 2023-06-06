package secao11

fun main(){
    println(mediaVarArg(10f,8f,9f))
}

fun mediaVarArg(vararg notas: Float): Float{
    return (notas.sum())/notas.size
}