package secao11

fun main(){
    println(salary(1000f, 2000f))
}
fun salary(salary: Float, workedTime: Float, hourlyRate: Float = 200.0f) : Float {
    return salary / hourlyRate * workedTime
}