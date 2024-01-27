import javax.swing.JOptionPane
import kotlin.math.pow

fun main() {
    val altura: Double = JOptionPane.showInputDialog("Digite sua Altura:").toDouble()
    val peso: Int = JOptionPane.showInputDialog("Digite seu Peso:").toInt()
    val IMC = String.format("%.2f",CalculoIMC(altura, peso))
    exibirMensagem( "O seu IMC é: ${IMC}")
}

fun exibirMensagem(frase: String) {
    JOptionPane.showMessageDialog(null, frase)
}

fun CalculoIMC(altura: Double, peso : Int) : Double {
    return peso / (altura.pow(2.0))
}