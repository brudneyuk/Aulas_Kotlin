import javax.swing.JOptionPane

fun main() {
    val altura: Double = JOptionPane.showInputDialog("Digite sua Altura:").toDouble()

    when (altura) {
        in 0.0..1.79 -> exibirtexto("Você não pode jogar basquete")
        in 1.8..Double.MAX_VALUE -> {
            exibirtexto("Você pode jogar basquete")
        }
    }
}