//Nivel de Dificuldade 6/10
fun main() {
    println("Informe um número")
    var numero = readLine()?.toIntOrNull()?: return

    var x = 1
    while (x <= numero) {
        println(x)
        x += 2
    }
}