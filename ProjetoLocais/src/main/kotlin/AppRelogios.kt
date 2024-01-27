import javax.swing.JOptionPane

fun main() {
    var relogio1 = Relogio()

    relogio1.horas = JOptionPane.showInputDialog("Informe as horas: ").toInt()
    relogio1.minutos = JOptionPane.showInputDialog("Informe os minutos: ").toInt()
    relogio1.segundos = JOptionPane.showInputDialog("Informe os segundos: ").toInt()


    var maisHoras = JOptionPane.showInputDialog("Informe as horas para adicionar: ").toInt()
    var maisMinutos = JOptionPane.showInputDialog("Informe os minutos para adicionar: ").toInt()
    var maisSegundos = JOptionPane.showInputDialog("Informe os segundos para adicionar: ").toInt()

    relogio1.adicionarTempo(maisHoras, maisMinutos, maisSegundos)
    JOptionPane.showMessageDialog(null,relogio1.horaAtual())
}