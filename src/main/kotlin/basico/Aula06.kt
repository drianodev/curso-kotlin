package basico
/*
    ESTRUTURA DE DECISÃO - FOR
*/
fun main() {
    println("Primeiro For")
    for (i in 1 .. 10) {
        print("${i} ")
    }
    print("\n")
    println("Segundo For")
    for (i in 10 downTo 1) {
        print("${i} ")
    }
    print("\n")
    println("Terceiro For")
    val str: String = "Criação de alicativos Android"
    for (i in str) {
        print("${i} ")
    }
    print("\n")
    println("Quarto For")
    for (i in 1 .. 20 step 2) { // pulando de 2 em 2
        print("${i} ")
    }
    print("\n")
    println("Quinto For")
    for (i in 30 downTo  1 step 3) {
        print("${i} ")
    }
}