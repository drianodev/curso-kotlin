package intermediario
/*
    CHAMADA ENTRE FUNÇÕES
*/
fun casa() {
    println("Entrando na casa...")
    quarto()
}

fun quarto() {
    println("Entrando no quarto...")
    computador()
}

fun computador() {
    println("Abrindo o pc")
}

fun main() {
    casa()
}