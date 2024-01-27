import javax.swing.JOptionPane

fun main() {
    val nome = JOptionPane.showInputDialog("Digite seu nome:")
    val bairro = JOptionPane.showInputDialog("Digite seu bairro:")

    Exibirtxt("Você se chama $nome e mora no bairro $bairro")
}

fun Exibirtxt(txt: String) {
    JOptionPane.showMessageDialog(null, txt)
}