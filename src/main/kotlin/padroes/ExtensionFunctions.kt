package padroes

fun main() {
    println("Digite o titulo:")
    val titulo = readLine() ?: ""
    println("Digite o autor:")
    val autor = readLine() ?: ""

    val slugTitulo = titulo.generateSlug()
    val slugAutor = autor.generateSlug()

    println("Slug gerado para o livro:")
    println("${slugTitulo}_${slugAutor}")
}

fun String.generateSlug(): String {
    // Remove espaços e caracteres especiais, substituindo por traços
    val slug = this.replace(Regex("[^A-Za-z0-9 ]"), "")
        .replace("\\s+".toRegex(), "-")
        .toLowerCase()

    return slug
}
