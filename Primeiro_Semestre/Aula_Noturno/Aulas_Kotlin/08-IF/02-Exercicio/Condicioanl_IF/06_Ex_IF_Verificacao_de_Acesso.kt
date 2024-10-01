//Exercicío - Verificação de acesso. 

fun main() {
    val usuario = "vinicius" // Nome de usuário predefinido
    val senha = "senha123" // Senha predefinida

    // Verifica se o nome de usuário é "alice" e a senha é "senha123"
    if (usuario == "vinicius" && senha == "senha123") {
        println("Acesso permitido.") // Se as credenciais correspondem, imprime essa mensagem
    } else {
        println("Acesso negado.") // Caso contrário, imprime essa mensagem
    }
}

//===== Recebendo dados do usuário ======

// fun main() {
//     // Solicita ao usuário para digitar o nome de usuário
//     print("Digite o nome de usuário: ")
//     val usuarioInput = readLine()

//     // Solicita ao usuário para digitar a senha
//     print("Digite a senha: ")
//     val senhaInput = readLine()

//     val usuario = "vinny"
//     val senha = "mudar123"

//     // Verifica se o nome de usuário e senha fornecidos correspondem às credenciais definidas
//     if (usuarioInput == usuario && senhaInput == senha) {
//         println("Acesso permitido.")
//     } else {
//         println("Acesso negado.")
//     }
// }
