import javax.swing.JOptionPane

fun main() {
    val idade: Int = JOptionPane.showInputDialog("Digite a sua Idade").toInt()

    val validar = when (idade) {
        in 0..15 -> ExibirMensagem("Ainda não pode votar")
        else -> ExibirMensagem("Você já pode votar!")
    }

}

fun ExibirMensagem(frase: String){
    JOptionPane.showMessageDialog(null, frase)
}