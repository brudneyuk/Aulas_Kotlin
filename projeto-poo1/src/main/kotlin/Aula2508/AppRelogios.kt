package Aula2508

import javax.swing.JOptionPane

fun main() {

    val relogio1 = Relogio()

    relogio1.modelo = JOptionPane.showInputDialog("Informe o modelo do relogio")
    relogio1.preco = JOptionPane.showInputDialog("Informe o valor do relógio").toDouble()
    relogio1.horas = JOptionPane.showInputDialog("Informe as Horas").toInt()
    relogio1.minutos = JOptionPane.showInputDialog("Informe os minutos").toInt()
    relogio1.segundos = JOptionPane.showInputDialog("Informe os segundos").toInt()

    JOptionPane.showMessageDialog(null, relogio1.validar())
    JOptionPane.showMessageDialog(null, "Agora são ${relogio1.verHora()}")

    val relogio2 = Relogio()

    relogio2.modelo = JOptionPane.showInputDialog("Informe o modelo do 2° relogio")
    relogio2.preco = JOptionPane.showInputDialog("Informe o valor do 2° relógio").toDouble()
    relogio2.horas = JOptionPane.showInputDialog("Informe as Horas").toInt()
    relogio2.minutos = JOptionPane.showInputDialog("Informe os minutos").toInt()
    relogio2.segundos = JOptionPane.showInputDialog("Informe os segundos").toInt()

    JOptionPane.showMessageDialog(null, relogio2.validar())

    JOptionPane.showMessageDialog(null, "Hora no 2° relógio: ${relogio2.verHora()}")

}