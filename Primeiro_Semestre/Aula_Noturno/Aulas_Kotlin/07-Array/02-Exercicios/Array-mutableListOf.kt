fun main() {

    //criando uma lista mutavel de numeros inteiros vazia
    val numeros = mutableListOf<Int>()

    // Adicionando elementos a lista
    numeros.add(1)
    numeros.add(2) 
    numeros.add(3)

    //Exibindo a lista de numeros
    println("Lista de numeros: $numeros")

    // Removendo um elemento da lista
    numeros.removeAt(1)

    //Exbibindo a lista após a remoção 
    println("Lista de numeros após a remoção: $numeros")

}