package avancado

/*
    Classe Anônima
*/
// Interface que define um método
interface Saudacao {
    fun saudar(): String
}

fun main() {
    // Criando uma instância de uma classe anônima que implementa a interface Saudacao
    val pessoa: Saudacao = object : Saudacao {
        override fun saudar(): String {
            return "Olá, eu sou uma pessoa!"
        }
    }

    // Chamando o método da interface através da instância da classe anônima
    println(pessoa.saudar())
}
