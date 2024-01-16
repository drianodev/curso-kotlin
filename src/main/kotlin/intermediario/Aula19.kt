package intermediario

/*
    ANY, UNIT, NOTHING
*/
fun main() {
    // Any
    a(10)

    //Unit
    b()

    //Nothing
    c()
}

fun a(valor: Any) {
    println("Imprimindo o valor: $valor")
}

fun b(): Unit {
    println("Função sem retorno (void)")
}

fun c(): Nothing {
    TODO ("Função ainda a ser implementada")
}