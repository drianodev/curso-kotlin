package basico
/*
    CONTINUE E BREAK
*/
fun main() {
    var i: Int = 0
    while (i < 100) {
        if (i == 20) {
            break
        }
        print("${i} ")
        i++
    }
    print("\n")
    val str: String = "Teste de perfil"
    var j: Int = 0
    while (j < str.length) {
        if (str[j] == 'd') {
            break
        }
        print("${str[j]} ")
        j++
    }
    print("\n")
    for (i in 0 .. 20) {
        if (i % 2 == 0) {
            continue
        }
        print("${i} ")
    }
    print("\n")
    for (i in 0 .. (str.length-1)) {
        if (str[i] == 'd' || str[i] == 'p') {
            continue
        }
        print("${str[i]} ")
    }
}