package avancado

/*
    Interface
*/
// Interface com métodos abstratos e método com implementação padrão
interface Forma {
    val nome: String    // Propriedade abstrata

    fun calcularArea(): Double  // Método abstrato

    fun exibirInfo() {
        println("Isto é uma $nome.")
    }
}

// Classe que implementa a interface
class Circulo(val raio: Double) : Forma {
    override val nome: String = "Círculo"

    override fun calcularArea(): Double {
        return Math.PI * raio * raio
    }
}

// Classe que implementa a interface e fornece uma implementação diferente
class Quadrado(val comprimentoLado: Double) : Forma {
    override val nome: String = "Quadrado"

    override fun calcularArea(): Double {
        return comprimentoLado * comprimentoLado
    }

    override fun exibirInfo() {
        println("Isto é um quadrado especial com comprimento de lado $comprimentoLado.")
    }
}

fun main() {
    val circulo = Circulo(5.0)
    val quadrado = Quadrado(4.0)

    circulo.exibirInfo()
    println("Área do ${circulo.nome}: ${circulo.calcularArea()}")

    quadrado.exibirInfo()
    println("Área do ${quadrado.nome}: ${quadrado.calcularArea()}")
}
