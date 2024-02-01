package avancado

/*
    Herança
*/
open class Eletronico(marca: String) {
    var modelo: String = "Teste de herança"
    fun ligar() {
        println("ligando...")
    }
    fun desligar() {
        println("desligando...")
    }
}

class Computador(marca: String): Eletronico(marca) {
    fun instalarSoftware() {
        println("instalando...")
    }
}

fun main() {
    var computador: Computador = Computador("Lenovo")
    computador.modelo
    computador.ligar()
    computador.desligar()
    computador.instalarSoftware()
}