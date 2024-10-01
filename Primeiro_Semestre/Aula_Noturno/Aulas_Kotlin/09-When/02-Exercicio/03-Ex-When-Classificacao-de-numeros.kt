//Exercicio  - Classificação de Números

fun main() {
    // Definindo o número a ser classificado
    val numero = 7

    // Usando o 'when' para classificar o número
    val classificacao = when {
        numero > 0 -> "Positivo"
        numero < 0 -> "Negativo"
        else -> "Zero"
    }

    // Exibindo a classificação do número
    println("Classificação: $classificacao")
}


/*

fun main() {
    // Solicitando ao usuário que informe o número
    println("Digite um número:")
    val numero = readLine()?.toIntOrNull() ?: 0

    // Usando o 'when' para classificar o número
    val classificacao = when {
        numero > 0 -> "Positivo"
        numero < 0 -> "Negativo"
        else -> "Zero"
    }

    // Exibindo a classificação do número
    println("Classificação: $classificacao")
}

*/