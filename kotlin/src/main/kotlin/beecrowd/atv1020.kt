package beecrowd

fun main() {
    val n = readLine()!!.toInt()
    var anos: Int
    var meses: Int
    var dias: Int

    if(n>=30){
        if(n>365){
            anos = n/365
            if(n%365 > 30){
                meses = (n%365)/30
                dias = (n%365)%30
            }else{
                meses = 0
                dias = n%365
            }
        }else{
            anos = 0
            meses = n/30
            dias = n%30
        }
    }else{
        anos = 0
        meses = 0
        dias = n
    }
    println("$anos ano(s)\n" +
            "$meses mes(es)\n" +
            "$dias dia(s)")
}