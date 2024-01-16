package intermediario
/*
    LEITURA DE DADOS NO KOTLIN
*/
fun main() {
    val str = readln()
    val num1 = readln().toInt() ?: 0
    val num2 = readlnOrNull()?.toInt() ?: 0
    val bool = readlnOrNull()?.toBoolean() ?: false
    println("String $str")
    println("Int $num1")
    println("Int $num2")
    println("Boolean $bool")
}