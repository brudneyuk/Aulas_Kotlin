package Aula2508.segundaparte

import javax.swing.JOptionPane

fun main() {
    val pizza1 = PedidoPizza()

    pizza1.sabor = JOptionPane.showInputDialog("Informe o sabor da pizza").toString()
    pizza1.preco = JOptionPane.showInputDialog("Informe o preço da pizza").toDouble()
    pizza1.quantidadeAmigos = JOptionPane.showInputDialog("Informe a quantidade de amigos").toInt()

    val cupom = JOptionPane.showInputDialog("Informe seu Cupom")
    pizza1.validarCupom(cupom)

    JOptionPane.showMessageDialog(null,"${pizza1.descrever()}")

    pizza1.obterValorPorAmigo()
    JOptionPane.showMessageDialog(null, "Cada amigo vai pagar R$${"%.2f".format(pizza1.preco)}")

    val cuponsUsados = pizza1.obterCuponsUsados().toString()
    for (cuponsUsados in pizza1.obterCuponsUsados()) {
        JOptionPane.showMessageDialog(null, cuponsUsados)
    }

}