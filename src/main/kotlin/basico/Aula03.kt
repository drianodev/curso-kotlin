package basico
/*
    OPERADORES:
        - LÓGICOS
        - MATEMÁTICOS
        - COMPARATIVOS
*/
fun main() {
    // LÓGICOS
    var bool1: Boolean = false
    var bool2: Boolean = true
    println("Valor bool1 original ${bool1}")
    println("Valor bool2 original ${bool2}")
    println("Comparando com && ${bool1 && bool2}")
    println("Comparando com || ${bool1 || bool2}")
    bool1 = !(bool1)
    println("Negação ${bool1}")

    println("=======================================")
    // MATEMÁTICOS
    var n1: Int = 10
    var n2: Int = 5
    var som = n1 + n2
    var sub = n1 - n2
    var mul = n1 * n2
    var div = n1 / n2
    var mod = n1 % n2
    println("Soma = ${som}")
    println("Subtracao = ${sub}")
    println("Multiplicação = ${mul}")
    println("Divisão = ${div}")
    println("Módulo = ${mod}")

    println("=======================================")
    // COMPARATIVOS
    println("${n1 > n2} ou ${n1 < n2}")
    println("${n1 >= n2} ou ${n1 <= n2}")
    println("${n1 != n2} ou ${n1 == n2}")
}