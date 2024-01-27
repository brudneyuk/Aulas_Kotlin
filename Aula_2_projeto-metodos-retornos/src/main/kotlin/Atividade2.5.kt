import javax.swing.JOptionPane

fun main() {
    var salario: Double = JOptionPane.showInputDialog("Me diga seu salário:").toDouble()

    when (salario) {
        in 0.0..1000.0 -> Exibirtxt("Classe C")
        in 1000.01..2000.0 -> Exibirtxt("Classe B")
        in 2000.01..5000.0 -> Exibirtxt("Classe A")
        in 5000.0..Double.MAX_VALUE -> {
            Exibirtxt("Classe AA")
        }
    }
    if (salario < 0.0){
        Exibirtxt("Salário inválido")
    }
}