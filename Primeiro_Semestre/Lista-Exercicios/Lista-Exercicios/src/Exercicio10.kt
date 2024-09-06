//Nível de dificuldade: 3/10

fun mensagemFaculdade(nome: String, faculdade: String): String {
    return "Olá, meu nome é $nome e eu estudo na faculdade $faculdade."
}

fun main() {
    val nomeUsuario = "Murillo"
    val nomeFaculdade = "Fiap"
    val mensagem = mensagemFaculdade(nomeUsuario, nomeFaculdade)
    println(mensagem)
}
