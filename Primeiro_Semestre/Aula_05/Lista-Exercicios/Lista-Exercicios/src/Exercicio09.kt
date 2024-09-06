//Nível de dificuldade: 7/10

// Definindo a classe Professor com 5 campos
class Professor(
    val nome: String,
    val sobrenome: String,
    val idade: Int,
    val salario: Double,
    val disciplina: String
) {
    // Método para exibir os detalhes do professor
    fun exibirDetalhes() {
        println("Nome completo do professor: $nome $sobrenome")
        println("Idade do professor: $idade")
        println("O salário do professor é de: R$ $salario")
        println("A disciplina que o professor dá aula é: $disciplina")
    }
}

fun main() {
    // Recebe informações do professor
    print("Digite o nome: ")
    val nome = readLine() ?: "Desconhecido"

    print("Digite o sobrenome: ")
    val sobrenome = readLine() ?: "Desconhecido"

    print("Digite a idade: ")
    val idade = readLine()?.toIntOrNull() ?: 0

    print("Digite o salário: ")
    val salario = readLine()?.toDoubleOrNull() ?: 0.0

    print("Digite a disciplina: ")
    val disciplina = readLine() ?: "Inválida"

    // Cria uma instância da classe Professor com os dados fornecidos
    val professor = Professor(nome, sobrenome, idade, salario, disciplina)

    // Exibe os detalhes do professor
    professor.exibirDetalhes()
}
