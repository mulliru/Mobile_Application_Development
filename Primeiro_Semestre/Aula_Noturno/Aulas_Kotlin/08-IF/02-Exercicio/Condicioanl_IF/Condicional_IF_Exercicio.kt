//Exercicio  - Carro iguais ou Carros diferentes. 

import kotlin.math.*

fun main() {
    val salario: Float = 8500f
    val contas: Float = 8000f

    val carro1: String = "Fusca"
    val carro2: String = "Ferrari"

    if (salario > contas) {
        println("Ufa que bom")
    } else {
        println("Que pena")
    }

    if (salario == contas) {
        println("Igual")
    } else {
        println("Diferente")
    }

    if (carro1 == carro2) {
        println("Strings iguais")
    } else {
        println("Strings diferentes")
    }
}
