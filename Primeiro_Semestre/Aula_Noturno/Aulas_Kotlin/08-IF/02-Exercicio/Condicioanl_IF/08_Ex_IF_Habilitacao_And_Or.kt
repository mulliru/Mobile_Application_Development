//Exercicio And e OR

fun main() {
    val idade = 25
    val possuiCarteiraDeMotorista = true

    // Verifica se a pessoa é maior de idade (idade >= 18) e possui carteira de motorista
    if (idade >= 18 && possuiCarteiraDeMotorista) {
        println("Você pode dirigir legalmente.")
    } else {
        println("Você não pode dirigir legalmente.")
    }

    val temIngresso = false
    val estaComCamisaDoTime = true

    // Verifica se a pessoa tem ingresso OU está com a camisa do time
    if (temIngresso || estaComCamisaDoTime) {
        println("Você pode entrar no estádio.")
    } else {
        println("Você não pode entrar no estádio.")
    }
}

//Input dos dados. 

/*
fun main() {
    // Solicita ao usuário para digitar a idade
    print("Digite sua idade: ")
    val idade = readLine()?.toIntOrNull()

    // Solicita ao usuário para informar se possui carteira de motorista
    print("Você possui carteira de motorista? (true/false): ")
    val possuiCarteiraDeMotorista = readLine()?.toBoolean()

    if (idade == null || possuiCarteiraDeMotorista == null) {
        println("Entrada inválida.")
        return
    }

    // Verifica se a pessoa é maior de idade (idade >= 18) e possui carteira de motorista
    if (idade >= 18 && possuiCarteiraDeMotorista) {
        println("Você pode dirigir legalmente.")
    } else {
        println("Você não pode dirigir legalmente.")
    }
}



*/