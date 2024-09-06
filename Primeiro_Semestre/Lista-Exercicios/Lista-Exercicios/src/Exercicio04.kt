//Nível de dificuldade: 3/10

fun avaliaResultado(nota: Int): String {
    return when (nota) {
        1 -> "Péssimo"
        2 -> "Ruim"
        3 -> "Bom"
        4 -> "Ótimo"
        else -> "Nota inválida"
    }
}

fun main() {
    val nota = 4
    val resultado = avaliaResultado(nota)
    println(resultado)
}
