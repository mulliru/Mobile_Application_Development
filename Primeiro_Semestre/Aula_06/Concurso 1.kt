interface Professor {
    fun passarConcurso()
}

open class Cidadao{
    fun direitoDeveres(){
        println("Todo cidadao tem direito e deveres")
    }
}

class ProfFernando : Cidadao(), Professor{
    override fun passarConcurso() {
        println("Foi aprovado em concurso em sp")
    }
}

class ProfGuilherme : Cidadao(),Professor{
    override fun passarConcurso() {
        println("Foi aprovado em concurso no RN")
    }

}

fun main(){
    //Interface, um contrato que quando assumido, deverá ser implementado

    var guilherme = ProfGuilherme()
    guilherme.direitoDeveres()
}