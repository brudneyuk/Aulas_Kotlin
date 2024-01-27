package Aula2508.segundaparte

import javax.swing.JOptionPane

class PedidoPizza {
    var sabor: String = ""
    var preco: Double = 0.0
    var quantidadeAmigos: Int = 0
    var listadecupom = mutableListOf<String>() // Inicializa a lista vazia de cupons

    fun descrever(): String {
        return "Pedido de pizza de $sabor, que custa R$$preco"
    }

    fun validarCupom(cupom: String) {
        if (cupom == "amopizza") {
            preco = preco - (preco * 0.09)
        }
            listadecupom.add(cupom)
    }

    fun obterValorPorAmigo() {
        preco /= quantidadeAmigos
    }

    fun obterCuponsUsados(): List<String> {
        return listadecupom
    }

}
