//Nível de dificuldade: 4/10

fun calcularLoop(): Double{
    var total = 0.0
    var valor: Double

    while (true){
        println("Informe um valor ou digite 0 para skipar")
        valor = readLine()?.toDoubleOrNull()?: 0.0

        if(valor == 0.0){
            break
        }
        total += valor
    }
    return total
}

fun main() {
    val total = calcularLoop()
    println("Total: $total")

}