package avancado

/*
    Modificadores de Acesso
*/
class A {
    var int = 10
}

public class B {
    fun display() {
        println("Accessible everywhere")
    }
}

private class C {
    private val int = 10
    fun display() {
        println(int)
        println("Accessing int successful")
    }
}

internal class D {}

public class E {
    internal val int = 10
}

open class F {
    protected val int = 10
}

// derived class
class G: F() {
    fun getvalue(): Int {
        return int
    }
}

fun main() {
    println("PUBLIC")
    var a: A = A()
    println(a.int)
    var b: B = B()
    println(b.display())
    println("")
    println("PRIVATE")
    var c: C = C()
    println(c.display())
    println("")
    println("INTERNAL")
    var e: E = E()
    println(e.int)
    println("")
    println("PROTECTED")
    var g: G = G()
    println(g.getvalue())
}