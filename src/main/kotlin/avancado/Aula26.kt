package avancado

/*
    LATEINIT
*/
class Robo {
    lateinit var texto: String

    fun ligar() {
        texto = "Iniciando o robo..."
    }

    fun inicio_tardio() {
        if (!this::texto.isInitialized) {
            texto = "Iniciando tardiamente..."
            println(texto)
        }
    }
}

fun main() {
    var robo: Robo = Robo()
    println(robo.ligar())
    robo.inicio_tardio()
    println(robo.texto)
}