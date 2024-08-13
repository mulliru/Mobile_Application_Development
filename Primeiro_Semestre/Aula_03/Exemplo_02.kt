fun mostrarMsg(nome:String , anoNasc:Int) : Int {
    //println("Bom diaa! Sr(a). $nome, seu ano de nascimento: $anoNasc")
    var calcIdade:Int = 2024 - anoNasc
    return calcIdade
}

fun main() {
    println(mostrarMsg("Patrick", 2000))
    println(mostrarMsg("Elen", 2002))
}