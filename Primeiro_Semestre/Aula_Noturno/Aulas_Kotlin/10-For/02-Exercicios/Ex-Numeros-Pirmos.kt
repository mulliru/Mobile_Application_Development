fun main() {

    val num = 17 //Definindo o numero que será verificado se é primo ou não. 
    var isPrime = true // variável como true assumindo inicialmente que é primo.
   //
    for (i in 2 until num) {
        if (num % i == 0) { //verifica se é um numero divisível por i. 
        isPrime = false
        break // interromper o loop 
        }
    }
    //Após o loop, verificamos o valor de isPrime para determinar se é um primo ou não 
    if (isPrime) {
        println("$num é um número primo") // Se isPrime ainda for true, não divide por zero. 
    } else{ 
        println("$num não é um número primo") // Se isPrime for false, não é primo
    
    }
        
}

// Exercício 4: Verificar se um número é primo (fornecido pelo usuário)
// Commitar no github de vocês e vão abrir uma issue com seu git. 
