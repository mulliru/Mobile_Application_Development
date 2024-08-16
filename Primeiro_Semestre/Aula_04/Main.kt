package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun mostrarMsg(nome:String,  sobreNome:String, cpf:Int){
    println("Olá...$nome $sobreNome")
}

fun calcIdade(anoNasc:Int) : Int{
    var idade = 2024 - anoNasc
    return idade
}

fun main() {
        mostrarMsg(nome = "Larissa", sobreNome = "Lopes", 123456789)
        println(calcIdade(anoNasc = 2000))
    }
