//Exercicio - Avaliação de Notas

fun main() {
    // Definindo a nota do aluno
    val nota = 85

    // Usando o 'when' para avaliar o conceito da nota
    val conceito = when (nota) {
        in 0..49 -> "F"
        in 50..59 -> "D"
        in 60..69 -> "C"
        in 70..79 -> "B"
        in 80..100 -> "A"
        else -> "Nota inválida"
    }

    // Exibindo o conceito da nota
    println("Conceito: $conceito")
}

/*


fun main() {
    // Solicitando ao usuário que informe a nota
    println("Digite a nota do aluno:")
    val nota = readLine()?.toIntOrNull() ?: -1

    // Usando o 'when' para avaliar o conceito da nota
    val conceito = when (nota) {
        in 0..49 -> "F"
        in 50..59 -> "D"
        in 60..69 -> "C"
        in 70..79 -> "B"
        in 80..100 -> "A"
        else -> "Nota inválida"
    }

    // Exibindo o conceito da nota
    println("Conceito: $conceito")
}


*/