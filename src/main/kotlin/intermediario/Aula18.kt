package intermediario

import kotlin.math.sqrt

/*
    TRATAMENTO DE EXCEÇÕES - PARTE 2
*/
fun main() {

    try {
        var s: String? = null
        s = "adriano"
        println("O tamanho da String é: ${s!!.length}")

        var a = 10/2
        println("O resultado da divisão será: $a")

        var b = 9.0
        var c = sqrt(b)
        if (b < 0) {
            throw IllegalArgumentException()
        }

        var d = 1
        if (d == 1) {
            throw Exception("O valor de d não pode ser 1")
        }

    } catch (e: ArithmeticException) {
        println("Não existe divisão por zero")
    } catch (e: NullPointerException) {
        println("A variavel esta vazia")
    } catch (e: IllegalArgumentException) {
        println("Não existe raiz de numero negativo")
    } catch (e: Exception) {
        println("Exceção geral: ${e.message}")
    } finally {
        println("Executando finally")
    }

    println("Fim.")
}