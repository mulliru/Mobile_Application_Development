//Exercicio: Maior e Menor Elemento 

fun main() {

    //Array de inteiros 
    val numbers = intArrayOf(8, 3, 12, 6, 20, 30, 50)
    var min = numbers[0]   // Variável para armazenar o menor elemento 
    var max = numbers[0]  // Varíavel para armazenar o maior elemento 

    //Loop para encontrar o menor e o maior elemento 
    for (number in numbers) {
        if (number < min) {
            min = number

        }
        if (number > max) {
            max = number
        }
    }
    println("o menor elemento é $min")
    println("o menor elemento é $max")
}