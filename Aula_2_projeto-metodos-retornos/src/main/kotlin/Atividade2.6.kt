import javax.swing.JOptionPane

fun main() {
    val frase_positiva = JOptionPane.showInputDialog("Me fale uma frase positiva:")
    val qtd_de_repeticoes = JOptionPane.showInputDialog("Quantas repetições da frase?").toInt()

    for (i in 1..qtd_de_repeticoes){
        Exibirtxt("$frase_positiva")
    }
}