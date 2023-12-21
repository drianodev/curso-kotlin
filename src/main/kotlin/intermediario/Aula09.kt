package intermediario
/*
    FUNÇÕES E SEUS TIPOS
*/
fun impressao() {
    println("Função sem parâmetro e sem retorno")
}

fun soma(a: Int, b: Int) : Int {
    return a + b
}

fun subtracao(a: Int, b: Int) {
    println("A subtração é ${a-b}")
}

fun main() {
    impressao()

    var x = 10
    var y = 10
    println(soma(x, y))
}