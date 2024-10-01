//Exercicio: Inversão de Array

fun main() {

    //Array Original 
    val originalArray = arrayOf(1,2,3,4,5)
    val reversedArray = originalArray.reversedArray() // array invertido 

    // array original : 1,2,3,4,5 
    println("Array original: ${originalArray.joinToString()}")

    // array invertido : 5,4,3,2,1 
    println("Array invertido: ${reversedArray.joinToString()}")

    //Exemplo como é utilizado A - Z , OU Z - A 

} 