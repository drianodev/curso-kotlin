package basico
/*
    ESTRUTURA DE DECISÃO - WHEN
*/
fun main() {
    var cargo: String = "Gerente"

    when (cargo) {
        "Presidente" -> println(6000f)
        "Gerente" -> println(4500f)
        "Coordenador" -> println(3000f)
        "Analista" -> println(1500f)
        "Estagiario" -> println(600f)
        else -> println("Cargo não existe")
    }
}
