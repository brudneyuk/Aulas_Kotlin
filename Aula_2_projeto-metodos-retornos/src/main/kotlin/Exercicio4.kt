import javax.swing.JOptionPane

fun main() {
    val qtd_gols: Int = JOptionPane.showInputDialog("Digite a quantidade de gols:").toInt()

    when (qtd_gols) {
        0 -> exibirtexto("Sem pontaria")
        in 1..2 -> exibirtexto("Pontaria meia boca")
        in 3..5 -> exibirtexto("Dá pro gasto")
        in 5..Int.MAX_VALUE -> {
            exibirtexto("Artilheiro")
        }
    }
}

fun exibirtexto(texto: String) {
    JOptionPane.showMessageDialog(null,texto)
}