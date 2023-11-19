/*
    VARIAVEIS E SEUS TIPOS
*/
fun main() {
    // Mutavel - var
    var x: Int

    // Imutavel - val
    val y: Int

    // Tipos
    var a: Int = 10
    var b: Float = 19.05f
    var c: Double = 3.14535
    var d: Long = 1000100010
    var e: Char = 'A'
    var f: String = "Adriano"
    var g: Short = 100
    var h: Byte = 0b1010
    var i: Byte = 0xf
    var j: UInt = 12u // Unsigned - sem sinal (só positivo)

    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(g)
    println(h)
    println(i)
    println(j)

    var t: Int = 10
    var str: String = "Total"
    var bool: Boolean = true

    t++
    str += "Perfeito"

    println("Numero: ${t}")
    println("String ${str}")
    println("Boolean ${bool}")
}