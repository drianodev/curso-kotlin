package intermediario

import java.util.Scanner

/*
    LEITURA DE DADOS COM JAVA NO KOTLIN
*/
fun lerInt() {
    val scanner = Scanner(System.`in`)
    println("Digite um inteiro: ")
    val num = scanner.nextInt()
    println("Você digitou ${num}")
}

fun lerString() {
    val scanner = Scanner(System.`in`)
    println("Digite uma String: ")
    val str = scanner.next()
    println("Você digitou ${str}")
}

fun main() {
    lerInt()
    lerString()
}