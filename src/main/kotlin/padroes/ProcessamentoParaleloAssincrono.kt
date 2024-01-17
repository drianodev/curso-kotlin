package padroes

fun main() {
    val urls = mutableListOf<String>()

    while (true) {
        println("Digite a url:")
        val input = readLine() ?: break
        if (input.isBlank()) break
        urls.add(input)
    }

    println("Iniciando downloads...")

    // Cria uma lista de Pair (indice, tamanho)
    val results = mutableListOf<Pair<Int, Int>>()

    val threads = urls.mapIndexed { index, url ->
        Thread {
            val length = openLink(url)
            synchronized(results) {
                results.add(Pair(index, length))
            }
        }
    }

    // Inicia cada Thread para começar o processo de 'download' paralelamente.
    threads.forEach { it.start() }

    // Aguarde até que todas as Threads terminem suas respectivas execuções.
    threads.forEach { it.join() }

    // Ordena os resultados por índice para imprimir na ordem correta
    results.sortedBy { it.first }.forEachIndexed { idx, result ->
        println("Arq${idx + 1}: ${result.second}")
    }
    println("Tempo total: ${urls.size}")
}

// Simula a abertura de uma URL, retornando seu tamanho.
fun openLink(url: String): Int {
    // Simulação de download de 1 segundo
    Thread.sleep(1000)
    return url.length
}
