package intermediario
/*
    MATRIZ DE INTEIROS
*/
fun main() {
    val linhas = 3
    val colunas = 3

    val matriz: Array<Array<Int>> = Array(linhas) {Array(colunas) {0} }

    var digito = -1

    println("Imprimindo original...")
    for (i in 0 until  linhas) {
        for (j in 0 until colunas) {
            print("${matriz[i][j]} ")
        }
        println()
    }
    println("Adicionando valores...")
    for (i in 0 until  linhas) {
        for (j in 0 until colunas) {
            matriz[i][j] = ++digito
        }
    }
    println("Imprimindo com valores...")
    for (i in 0 until  linhas) {
        for (j in 0 until colunas) {
            print("${matriz[i][j]} ")
        }
        println()
    }
    println("Imprimindo de outra forma...")
    for (linha in matriz) {
        for (valor in linha) {
            print("${valor} ")
        }
        println()
    }

    println("Quantidade de linhas: ${matriz.size}")
    println("Quantidade de colunas: ${matriz[0].size}")
}