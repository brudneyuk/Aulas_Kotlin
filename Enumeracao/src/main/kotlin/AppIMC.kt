import javax.swing.JOptionPane
import javax.swing.JOptionPane.*

fun main() {

    val pesoX = showInputDialog("peso?").toDouble()
    val alturaX = showInputDialog("altura?").toDouble()
    val imc = pesoX / (alturaX * alturaX)

    try {
    val IMCX = IMC.aPartirDoPeso(imc)
    println(imc)

    showMessageDialog(null, "IMC: ${IMCX.descricao}, ${IMCX.acao}")
    } catch (excecao: ImcInvalidoException) {
        showMessageDialog(null, "Valor de IMC inválido")
    }
}