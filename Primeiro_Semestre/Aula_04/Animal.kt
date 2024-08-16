package org.example

open class Animal(){
    //Propriedades
    var cor:String = ""
    var idade:Int = 0
    var peso:Double = 0.00

    //Métodos
    open fun dormir(){
        println("Dormindo...")
    }
}

class Cachorro : Animal(){

    //Métodos
    override fun dormir() {
        super.dormir()
        println("Dormindo como um cachorro...")
    }
    fun latir(){
        println("RUFF RUFF")
    }

}

fun main(){
    var cachorro1 = Cachorro()
    cachorro1.cor = "Caramelo"
    cachorro1.peso =3.400
    cachorro1.idade = 2
    cachorro1.latir()




}