fun main() {
    //listOf -> imutável, tamanho fixo, e nao pode ser alterado
    //ArrayListOF -> mutável, tamanho nao é fixo, e pode ser alterado
    // set -> n fica em oderm, n permite duplicados
    /// map -> estrutura de chave/valor

    var mapa = hashMapOf(
        "Leão" to "Rei da floresta",
        "Cachorro" to "Melhor amg do homem",
        "Gato" to "Arranha"
    )
    mapa.put("Panda", "só hiberna")
    mapa.remove("Gato")

    for (item in mapa) {
        println(mapa.values)
    }
}