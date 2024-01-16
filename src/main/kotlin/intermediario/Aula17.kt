package intermediario

import kotlin.math.sqrt

/*
    TRATAMENTO DE EXCEÇÕES - PARTE 1
*/
fun main() {
    val n1 = 10
    val n2 = 0

    try {
        val res = (n1 / n2)
        println("Resultado da divisão = $res")
    } catch (e: ArithmeticException) {
        println("Erro: divisão por zero")
    }

    val n3 = 2

    try {
        val res = (n1 / n3)
        println("Resultado da divisão = $res")
    } catch (e: ArithmeticException) {
        println("Erro: divisão por zero")
    }

    val n4 = -4.5

    try {
        val raiz = sqrt(n4)
        if (n4 < 0) {
            throw IllegalArgumentException()
        }
        println("Resultado da raiz = $raiz")
    } catch (e: IllegalArgumentException) {
        println("Não existe raiz real de números negativos")
    }

    val n5 = 10.0

    try {
        val raiz = sqrt(n5)
        if (n5 < 0) {
            throw IllegalArgumentException()
        }
        println("Resultado da raiz = $raiz")
    } catch (e: IllegalArgumentException) {
        println("Não existe raiz real de números negativos")
    }
}