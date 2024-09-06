//Nível de dificuldade: 9/10

fun calcularMediaWhile() {
    // Declarar e inicializar variáveis
    var total = 0.0
    var contador = 0

    while (true) {
        println("Informe um número positivo (ou um número negativo ou zero para sair): ")
        val numero = readLine()?.toDoubleOrNull() ?: break

        if (numero <= 0) {
            break
        }

        // Somar ao total e incrementar o contador
        total += numero
        contador++
    }

    // Calcular a média
    val media = if (contador > 0) total / contador else 0.0

    // Apresentar os resultados
    println("\nTotal de números informados: $contador")
    println("Valor total: R$$total")
    println("Média dos números: R$$media")
}

fun main() {
    calcularMediaWhile()
}
