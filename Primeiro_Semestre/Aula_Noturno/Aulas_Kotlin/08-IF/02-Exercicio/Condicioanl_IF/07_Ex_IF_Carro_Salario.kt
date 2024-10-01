
//Exercicio - Carro x Salario

import kotlin.math.*

fun main() {
    var salario: Float = 5000f
    var contas: Float = 5000f

    var carro1: String = "Fusca"
    var carro2: String = "Brasilia"

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