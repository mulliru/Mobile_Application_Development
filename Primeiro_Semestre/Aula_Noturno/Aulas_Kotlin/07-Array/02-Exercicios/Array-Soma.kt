//Exercicio: Soma dos Elementos
fun main() {

    //Array de inteiros
    val numbers = intArrayOf(5,10,15,20,25) // imutável 
    var sum = 0 // Variavel para armazenar a soma // mutável

    //Loop para somar os elementos do array 
    for (number in numbers) {

        sum += number 
    }

    //Imprima o resultado 
    println("Soma dos elementos do array: $sum")
}



