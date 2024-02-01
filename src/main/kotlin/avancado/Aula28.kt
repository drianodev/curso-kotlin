package avancado

/*
    DataClass
*/
class Retangulo(var a: Int, var b: Int) {
//    override fun equals(other: Any?): Boolean {
//        return if ( other is Retangulo ) {
//            ( other.a == this.a && other.b == this.b )
//        } else {
//            false
//        }
//    }
}

data class RetanguloData(var a: Int, var b: Int)

data class Endereco(var estado: String, var cidade: String)

fun main() {
    var ret1: Retangulo = Retangulo(10, 20)
    var ret2: Retangulo = Retangulo(10, 20)
    println(ret1.equals(ret2))
    println("===================================")
    var ret3: RetanguloData = RetanguloData(10, 20)
    var ret4: RetanguloData = RetanguloData(10, 20)
    println(ret3.equals(ret4))

    var ret5: RetanguloData = RetanguloData(100, 200)
    println(ret5.toString())
    ret5 = ret4.copy()
    println(ret5.toString())

    fun endereco(e: Endereco) {}
}