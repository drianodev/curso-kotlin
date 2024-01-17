package avancado

/*
    Construtores: primário e secundário
*/

class Silvestre(var nome: String) {
    // o contrutor primario já ta incluso

    var atk: Int? = null
    // construtor secundario (manipulavel)
    constructor(nome: String, atk: Int) : this(nome) {
        this.atk = atk
    }

    fun apresentacao() {
        println("Meu animal silvestre é: $nome e seu ataque é: $atk")
    }
}

fun main() {
    val s1 = Silvestre("Aguia")
    val s2 = Silvestre("Onça", 1000)

    s1.apresentacao()
    s2.apresentacao()
}