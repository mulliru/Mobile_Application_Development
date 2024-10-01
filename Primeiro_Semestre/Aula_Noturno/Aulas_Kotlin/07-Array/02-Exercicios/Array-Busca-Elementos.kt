//Exercio: Busca Elementos

fun main() {

    //Array de strings
    val names = arrayOf("Alice", "Bob","Charlie", "David", "Emma")
    val searchName = "Alice" // Elemento a ser buscado 
    var found = false        //variável para verificar se o elemento foi encontrado 

    // Loop para vericiar se o elemento está presente 
    for (name in names) {
        if (name == searchName) {
            found = true
            break 
        }
 }

     if (found) {
        println("$searchName foi encontrado no array.")
     } else {

        println("$searchName não foi encontrado no array.") 
     }
}