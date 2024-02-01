package avancado

/*
    Companion Object e Object
*/
class MyClass {
    companion object {
        const val CONSTANT_VALUE = "This is a constant in Companion Object"

        fun staticFunction() {
            println("Static function in Companion Object")
        }
    }
}

object SingletonObject {
    const val CONSTANT_VALUE = "This is a constant in Singleton Object"

    fun singletonFunction() {
        println("Singleton function in Object")
    }
}

fun main() {
    println("Companion Object")
    println(MyClass.CONSTANT_VALUE)
    MyClass.staticFunction()
    println("")
    println("Object")
    println(SingletonObject.CONSTANT_VALUE)
    SingletonObject.singletonFunction()
}
