package intermediario
/*
    VETORES
*/
fun vetorInteiros() {
    var numeros = intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    for (i in 0 .. (numeros.size-1)) {
        print("${numeros[i]}")
    }
    print("\n")
}

fun vetorInteiros2() {
    var n = Array(10, {i->i})
    for (i in n) {
        print("${n[i]}")
    }
    print("\n")
}

fun vetorBooleans() {
    var bool = booleanArrayOf(true, false, false, true)
    for (i in 0 .. (bool.size-1)) {
        print("${bool[i]} ")
    }
    print("\n")
}

fun vetorString() {
    var str = arrayOf("Fortaleza", "Russas", "Maracanaú")
    for (i in 0 .. (str.size-1)) {
        print("${str[i]} ")
    }
    print("\n")
}

fun main() {
    vetorInteiros()
    vetorInteiros2()
    vetorBooleans()
    vetorString()
}