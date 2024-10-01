//Exercicio1: Contagem regressiva

//

fun main() {

    println("Digite um número inteiro positivo")
    val input = readLine() //Solicitar e ler o numero fornecido pelo usuário

    if(input != null && input.isNotEmpty()) {
        val numero = input.toInt()
        
        var contador = numero //iniciar o contador com o numero fornecido 
        while (contador >= 1) { //enquanto o contador for maior ou igual a 1
        println(contador) // imprimi o valor atual do contador 
        contador-- //Decrementa o contador em 1 a cada interação
    
        }  
      } 
     else {println("Entrada invalida.")}
 }