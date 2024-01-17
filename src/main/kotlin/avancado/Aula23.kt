package avancado

/*
    Recurso INIT
*/

class Animal(var especie: String) {
    var fala: String = ""

    init {
        fala = if (especie.lowercase() == "cachorro") {
            "auau"
        } else if (especie.lowercase() == "gato") {
            "miau"
        } else {
            ""
        }
    }

    init {
        println(fala)
    }

    fun falar() {
        println(fala)
    }
}

fun main() {
    val animal = Animal("CACHORRO")
    Animal("GATo").falar()
    Animal("Cachorro").falar()
}