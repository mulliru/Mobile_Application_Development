//Nível de dificuldade: 2/10

fun avaliaResultadoIf(nota: Int): String {
    if (nota == 1) {
        return "Péssimo"
    } else if (nota == 2) {
        return "Ruim"
    } else if (nota == 3) {
        return "Satisfatório"
    } else if (nota == 4) {
        return "Bom"
    } else if (nota == 5) {
        return "Ótimo"
    } else {
        return "Nota inválida"
    }
}

fun main() {
    val nota = 1
    val resultado = avaliaResultadoIf(nota)
    println(resultado)
}
