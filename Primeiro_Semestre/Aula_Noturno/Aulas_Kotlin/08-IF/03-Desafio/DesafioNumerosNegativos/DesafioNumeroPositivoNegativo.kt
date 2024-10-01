fun main() {
    // Solicita ao usuário para inserir um número
    print("Digite um número: ")
    val numero = readLine()?.toDoubleOrNull()

    // Verifica se o número é nulo ou não
    if (numero == null) {
        println("Valor inválido. Certifique-se de inserir um número.")
    } else {
        // Verifica se o número é positivo, negativo ou zero
        val mensagem = when {
            numero > 0 -> "O número é positivo."
            numero < 0 -> "O número é negativo."
            else -> "O número é zero."
        }

        // Exibe a mensagem correspondente
        println(mensagem)
    }
}
