fun main(){
    //listOf -> imutável, tamanho fixo, e nao pode ser alterado
    //ArrayListOF -> mutável, tamanho nao é fixo, e pode ser alterado

    var estadosBr = listOf("RS", "SC", "PR")
    var nomeAlunos = arrayListOf("Larrisa", "Luna", "Deyckson")

    nomeAlunos.add("Lucas")
    nomeAlunos[1] = ("Gabriel")
    nomeAlunos.remove("Luna")
    nomeAlunos.removeAt(2)

    println(nomeAlunos) //printa
    println(nomeAlunos.size) // para ver o tamanho
    println(nomeAlunos.isEmpty()) //serve para mostrar se é vazio ou não

}