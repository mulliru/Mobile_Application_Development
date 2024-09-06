//Nível de dificuldade: 11/10

fun fazerLoop(produtosInput: List<Pair<String, Double>>) {
    // Cria um mapa mutável para armazenar os produtos
    val produtos = mutableMapOf<String, Double>()

    // Adiciona os produtos do input ao mapa
    for ((nomeProduto, precoProduto) in produtosInput) {
        produtos[nomeProduto] = precoProduto
    }

    // Exibe os produtos informados
    println("\nProdutos informados:")
    for ((nome, preco) in produtos) {
        println("Produto: $nome, Preço: $preco")
    }

    // Calcula e exibe o valor médio dos produtos
    val valorMedio = if (produtos.isNotEmpty()) produtos.values.average() else 0.0
    println("\nValor médio dos produtos: $valorMedio")

    // Ordena os produtos por preço e converte para um mapa
    val produtosOrdenados = produtos.toList().sortedBy { (_, preco) -> preco }.toMap()
    val iterator = produtosOrdenados.iterator()

    // Exibe os produtos ordenados por preço usando um loop while
    println("\nProdutos ordenados por preço:")
    while (iterator.hasNext()) {
        val (nome, preco) = iterator.next()
        println("Produto: $nome, Preço: $preco")
    }
}

fun main() {
    // Lista de produtos de exemplo
    val produtosInput = listOf(
        "Produto1" to 10.0,
        "Produto2" to 20.0,
        "Produto3" to 15.0
    )
    // Chama a função fazerLoop com a lista de produtos
    fazerLoop(produtosInput)
}