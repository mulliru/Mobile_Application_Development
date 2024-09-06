//Nível de dificuldade: 8/10

// Função para calcular o valor final com desconto
fun calcularValorFinal(valorProduto: Double, percentualDesconto: Double): Double {
    // Calcular o valor do desconto
    val desconto = valorProduto * (percentualDesconto / 100)
    // Calcular o valor final subtraindo o desconto do valor original do produto
    return valorProduto - desconto
}

fun main() {
    // Recebe o valor do Produto
    print("Digite o valor do produto: ")
    val valorProdutoInput = readLine()
    val valorProduto = valorProdutoInput?.toDoubleOrNull() ?: run {
        println("Valor do produto inválido.")
        return
    }

    // Recebe o valor do Desconto
    print("Digite a porcentagem de desconto: ")
    val percentualDescontoInput = readLine()
    val percentualDesconto = percentualDescontoInput?.toDoubleOrNull() ?: run {
        println("Porcentagem de desconto inválida.")
        return
    }

    // Calculando o valor final do produto
    val valorFinal = calcularValorFinal(valorProduto, percentualDesconto)

    // Exibindo o valor final do produto
    println("O valor final é: $valorFinal")
}
