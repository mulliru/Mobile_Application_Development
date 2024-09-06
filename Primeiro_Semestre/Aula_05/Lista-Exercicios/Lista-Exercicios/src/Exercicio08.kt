//Nível de dificuldade: 7/10

// Classe Pai
open class Pessoa(
    var nome: String,
    var idade: Int
) {
    // Método que será herdado
    open fun mostrarDetalhes() {
        println("O nome é $nome e a idade é $idade")
    }

    // Método para ser sobrescrito
    open fun sexo() {
        println("O sexo é indefinido")
    }
}

// Classe Filho 1
class Homem(nome: String, idade: Int) : Pessoa(nome, idade) {
    // Método sobrescrito de sexo
    override fun sexo() {
        println("O sexo é masculino")
    }
}

// Classe Filho 2
class Mulher(nome: String, idade: Int) : Pessoa(nome, idade) {
    // Método sobrescrito de sexo
    override fun sexo() {
        println("O sexo é feminino")
    }
}

fun main() {
    // Criando os três objetos da subclasse Homem
    val homem1 = Homem("Carlos", 30)
    println("\nInformações do homem número 1")
    homem1.mostrarDetalhes()
    homem1.sexo()

    val homem2 = Homem("Pedro", 28)
    println("\nInformações do homem número 2")
    homem2.mostrarDetalhes()
    homem2.sexo()

    val homem3 = Homem("João", 25)
    println("\nInformações do homem número 3")
    homem3.mostrarDetalhes()
    homem3.sexo()

    // Criando os três objetos da subclasse Mulher
    val mulher1 = Mulher("Ana", 27)
    println("\nInformações da mulher número 1")
    mulher1.mostrarDetalhes()
    mulher1.sexo()

    val mulher2 = Mulher("Beatriz", 22)
    println("\nInformações da mulher número 2")
    mulher2.mostrarDetalhes()
    mulher2.sexo()

    val mulher3 = Mulher("Clara", 24)
    println("\nInformações da mulher número 3")
    mulher3.mostrarDetalhes()
    mulher3.sexo()
}
