//Exercício - Verificação de tipo 

fun main() {
    // Definindo um valor com um tipo desconhecido
    val valor: Any = 42

    // Usando o 'when' para verificar o tipo do valor
    val tipo = when (valor) {
        is Int -> "Inteiro"
        is String -> "Texto"
        is Boolean -> "Booleano"
        else -> "Tipo desconhecido"
    }

    // Exibindo o tipo do valor
    println("Tipo: $tipo")
}


/*

//=============input de dados======

fun main() {
    // Solicitando ao usuário que informe um valor
    println("Digite um valor:")
    val valorInput = readLine() ?: ""
    val valor: Any = when {
        valorInput.toIntOrNull() != null -> valorInput.toInt()
        valorInput.toBooleanOrNull() != null -> valorInput.toBoolean()
        else -> valorInput
    }

    // Usando o 'when' para verificar o tipo do valor
    val tipo = when (valor) {
        is Int -> "Inteiro"
        is String -> "Texto"
        is Boolean -> "Booleano"
        else -> "Tipo desconhecido"
    }

    // Exibindo o tipo do valor
    println("Tipo: $tipo")
}
*/