package avancado

/*
    Sobrescrita e Sobrecarga
*/
open class Pet {
    open fun makeSound() {
        println("Animal makes a generic sound")
    }
}

class Dog : Pet() {
    override fun makeSound() {
        println("Dog barks")
    }

    fun makeSound(volume: Int) {
        println("Dog barks with volume $volume")
    }
}

fun main() {
    val genericAnimal: Pet = Dog()
    genericAnimal.makeSound() // Chama a implementação específica de Dog

    val dog = Dog()
    dog.makeSound()         // Chama a implementação específica de Dog
    dog.makeSound(3)        // Chama o método sobrecarregado de Dog
}
