package org.example

class Casa(cor:String, vagasGaragem:Int){
    //Propriedades/Atributos
     var cor:String
    var vagasGaragem:Int

    init{
        this.cor = cor
        this.vagasGaragem = vagasGaragem
    }

    //Métodos
    fun detalhesCasa(){
        println("COR: ${cor}  \nVagas ${vagasGaragem}")
        println()
    }
    fun abrirJanelas(){
        println("Abrindo janelas...")
    }
    fun abrirPortas(){
        println("Abrindo portas...")
    }
}

fun main(){
    var casaDoPresidente = Casa("Amarela", vagasGaragem = 3)
    casaDoPresidente.detalhesCasa()
}