package avancado

import java.time.Year

/*
    Dados no paradigma de orientação a objetos
 */

class Aluno(val anoNascimento: Int, var nome: String) {
    var idade = Year.now().value - anoNascimento

    fun saudacao() {
        println("Seja bem vindo ${this.nome}")
        println("Vc tem ${this.idade} anos")
    }
}

fun main() {
    println("Digite o ano que vc nasceu:")
    var idade = readlnOrNull()?.toInt() ?: 0

    println("Digite o seu nome:")
    var nome = readln()

    var aluno: Aluno = Aluno(idade, nome)

    aluno.saudacao()
}