package basico
/*
    ESTRUTURA DE DECISÃO - IF - ELSE
*/
fun main() {
    var idade: Int = 66

    if (idade <= 12) {
        println("Essa pessoa é criança")
    } else if (idade >= 13 && idade <= 20) {
        println("Essa pessoa é jovem")
    } else if (idade >= 21 && idade <= 59) {
        println("Essa pessoa é adulta")
    } else {
        println("Essa pessoa é idosa")
    }
}