package basico
/*
    ESTRUTURA DE DECISÃO - WHILE - DO WHILE
*/
fun main() {
    var i: Int = 0
    while (i <= 10) {
        print("${i} ")
        i++
    }
    print("\n")
    while (i >= 0) {
        print("${i} ")
        i--
    }
    print("\n")
    val str: String = "Criação de alicativos Android"
    var j: Int = 0
    while (j < str.length) {
        print("${j} ")
        j++
    }

    print("\n")
    var k: Int = 0
    do {
        print("${k} ")
        k++
    } while (k != 10)

    print("\n")
    do {
        print("Qual o seu nome? ")
        val value = readLine()
    } while (value == "")
}
