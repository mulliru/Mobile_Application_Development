//Exercício 2: Soma dos múltiplos de 3
//Criar um programa que solicita um número inteiro positivo e calcula a soma de todos os múltiplos de 3 que sejam menores ou iguais ao número fornecido.

fun main() {

    println("Digite um número inteiro positivo:")
    val numero = readLine()!!.toInt() //Solicita e lê o número fornecido pelo usuário. 

    var soma = 0 // Inicializando a variável soma
    var contador = 3 //Inicializando o contador com o primeiro multiplo de 3
    while (contador <=numero) {
        soma += contador //adiciona o valor do contador a soma
        contador += 3 // Incrementa o contador em 3 para obter os proximo multiplo de 3

    }
    println("A soma dos multiplicos de 3 até $numero é : $soma") // imprime o resultado 

}
