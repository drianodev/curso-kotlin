package avancado

/*
    Classe Abstrata
*/
abstract class Shape {
    // Propriedade abstrata (deve ser implementada por subclasses)
    abstract val name: String

    // Método abstrato (deve ser implementado por subclasses)
    abstract fun calculateArea(): Double

    // Método com implementação padrão
    fun displayInfo() {
        println("This is a $name.")
    }
}

class Circle(radius: Double) : Shape() {
    override val name: String = "Circle"
    private val radius: Double = radius

    override fun calculateArea(): Double {
        return Math.PI * radius * radius
    }
}

class Square(sideLength: Double) : Shape() {
    override val name: String = "Square"
    private val sideLength: Double = sideLength

    override fun calculateArea(): Double {
        return sideLength * sideLength
    }
}

fun main() {
    val circle = Circle(5.0)
    val square = Square(4.0)

    circle.displayInfo()
    println("Area of the ${circle.name}: ${circle.calculateArea()}")

    square.displayInfo()
    println("Area of the ${square.name}: ${square.calculateArea()}")
}
