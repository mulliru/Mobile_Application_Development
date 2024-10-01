// Exercicio - Tradução das Cores
fun main() {
    // Definindo a cor em português
    val cor = "vermelho"

    // Usando o 'when' para traduzir a cor
    val traducao = when (cor) {
        "vermelho" -> "red"
        "azul" -> "blue"
        "verde" -> "green"
        else -> "Cor desconhecida"
    }

    // Exibindo a tradução da cor
    println("Tradução: $traducao")
}


/*

fun main() {
    // Solicitando ao usuário que informe a cor em português
    println("Digite a cor em português:")
    val cor = readLine() ?: ""

    // Usando o 'when' para traduzir a cor
    val traducao = when (cor) {
        "vermelho" -> "red"
        "azul" -> "blue"
        "verde" -> "green"
        else -> "Cor desconhecida"
    }

    // Exibindo a tradução da cor
    println("Tradução: $traducao")
}
*/