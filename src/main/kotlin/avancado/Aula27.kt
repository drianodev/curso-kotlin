package avancado

/*
    WITH
*/
class Objeto {
    fun amanhecer(n: Int) {
        if (n >= 0 && n <= 4) {
           println("Está de madrugada")
        } else {
           println("Está de dia")
        }
    }

    fun acordar(n: Int) {
        if (n == 1) {
            println("Está dormindo")
        } else {
            println("Está acordado")
        }
    }
}

fun main() {
    var obj: Objeto = Objeto()
    obj.amanhecer(1)
    obj.acordar(0)
    println("=============================================")
    with(obj) {
        amanhecer(1)
        acordar(0)
    }
}