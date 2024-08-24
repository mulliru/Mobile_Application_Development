
enum class StatusPedido{
    APROVADO, CANCELADO, PENDENTE
}

class Pedido{
    var status:StatusPedido = StatusPedido.APROVADO
}


fun main() {

    //Enum -> É um tipo de dados que consiste em um
        //Conjunto de constantes
    val pedido01 = Pedido()
    println(pedido01.status)
}