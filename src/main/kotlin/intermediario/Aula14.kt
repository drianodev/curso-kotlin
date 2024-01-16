package intermediario
/*
    NULL SAFETY / OPERADOR ELVIS / FUNÇÃO LET
*/
fun main() {
    /* NULL SAFETY */
    // a ? indica que o valor pode ser nulo
//    var str: String = null
    val str: String? = null
    println(str?.length) // Kotlin assume o erro
//    println(str!!.length) // programador assume o erro

    /* OPERADOR ELVIS */
    var str1: String? = null
    println(str1 ?: "nula")

    /* FUNÇÃO LET */
    var str2: String? = null
    if (str2 != null) {
        println("Caiu no IF")
    }
    str2?.let {
        println("Função LET")
    }
    str2 = "Adriano"
    if (str2 != null) {
        println("Caiu no IF")
    }
    str2?.let {
        println("Função LET")
    }
}