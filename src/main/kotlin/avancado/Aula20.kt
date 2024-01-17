package avancado
/*
    Princípio da prática em orientação ao objeto
 */
import java.time.Year

class Pessoa(val anoNascimento: Int, var nome: String) {
    var idade = Year.now().value - anoNascimento

    fun saudacao() {
        println("Seja bem vindo ${this.nome}")
    }
}

fun main() {
    var pessoa: Pessoa = Pessoa(2002, "Adriano")
    println(pessoa.nome)
    println(pessoa.anoNascimento)

    println("Você tem ${pessoa.idade} anos")
    pessoa.saudacao()
}