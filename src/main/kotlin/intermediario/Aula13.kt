package intermediario
/*
    MATRIZ DE CHARS
*/
fun main() {
    val linhas = 5
    val colunas = 5

    val matriz: Array<Array<Char>> = Array(linhas) {Array(colunas) {' '} }

    var carac: Char = 'a'

    for (i in 0 until linhas) {
        for (j in 0 until colunas) {
            matriz[i][j] = carac
            carac++
        }
    }
    println("Matriz: ")
    for (i in 0 until linhas) {
        for (j in 0 until colunas) {
            print("${matriz[i][j]} ")
        }
        println()
    }
}