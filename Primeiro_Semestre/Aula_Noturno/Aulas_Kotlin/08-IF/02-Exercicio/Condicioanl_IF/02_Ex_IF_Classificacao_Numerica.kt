//Exercício -  Classificação Númerica

fun main() {
    val numero = 7 // Definindo o valor do número a ser verificado

    if (numero > 0) { // Verifica se o número é maior que zero
        println("O número é positivo.") // Se verdadeiro, imprime essa mensagem
    } else if (numero < 0) { // Caso contrário, verifica se o número é menor que zero
        println("O número é negativo.") // Se verdadeiro, imprime essa mensagem
    } else {
        println("O número é zero.") // Se nenhuma das condições anteriores for verdadeira, imprime essa mensagem
    }
}
