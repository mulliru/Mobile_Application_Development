// Exercicio Par ou Impar
// fun main() {

//     val numero = 9

//     if (numero % 2 == 0) {
//         println("O número é par.")
//     } else {
//         println("O número é ímpar.")
//     }
// }



// Recebendo entrada de dados
fun main() {
    println("Digite o número:")
    val input = readLine() // Lê a entrada do usuário

    // Verifica se a entrada não é nula e se pode ser convertida para um número inteiro
    
    val numero = input?.toIntOrNull()
    //O operador ?. é usado para garantir que você está lidando com a possibilidade de null de forma segura. 

    //Conversão de String para Int: Usei input?.toIntOrNull() para tentar converter a entrada 
    //do usuário em um número inteiro.
    //Se a conversão falhar (por exemplo, se o usuário digitar um texto), o valor de numero será null.
    
    if (numero == null) {
        println("Entrada inválida.")
        return // Sai da função main se a entrada for nula ou inválida
    }

    // Verifica se o número é par ou ímpar
    if (numero % 2 == 0) {
        println("O número é par.")
    } else {
        println("O número é ímpar.")
    }
}

