package ctrl_de_fluxo.when_

// WHEN SE PARECE COM O IF MAS SIGNIFICA "QUANDO"

fun calcSalario(cargo: String): Float{

    // ASSIM SE CRIA UM WHEN: QUANDO O CARGO "CARGO" -> {o que fazer} :
    return when(cargo){
        "gerente" -> 2000f
        "coordenador" -> 1500f
        "engenheiro" -> 1000f
        "estagiario" -> 500f
        else -> 0f
    }

}

fun main(){

}