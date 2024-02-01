package avancado

/*
    ENUMS
*/
enum class Prioridade {
    BAIXA, MEDIA, ALTA
}

enum class Prioridade2(val v: Int) {
    BAIXA(0), MEDIA(7), ALTA(10)
}

enum class Prioridade3(val value: Int) {
    B(0) {
        override fun toString(): String {
            return "Prioridade Baixa com o valor $value"
        }
    },
    M(7){
        override fun toString(): String {
            return "Prioridade Média com o valor $value"
        }
    },
    A(10){
        override fun toString(): String {
            return "Prioridade Alta com o valor $value"
        }
    }
}

enum class Animais {
    Gato, Cachorro, Papagaio
}

fun x(p: Prioridade) {}

fun main() {
    x(Prioridade.ALTA)

    for (p in Prioridade.entries) {
        print("$p ")
    }
    println()
    for (p2 in Prioridade2.entries) {
        print("$p2 - ${p2.v} ")
    }
    println()
    for (p3 in Prioridade3.entries) {
        print("$p3 ")
    }
    println()
    for (a in Animais.values()) {
        print("$a ")
    }
}
