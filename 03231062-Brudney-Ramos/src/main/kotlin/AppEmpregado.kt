import javax.swing.JOptionPane
import kotlin.system.measureNanoTime

fun main() {

    val empregado1 = Empregado()

    empregado1.nome = JOptionPane.showInputDialog("Informe o nome do empregado")
    empregado1.cargo = JOptionPane.showInputDialog("Informe o cargo de ${empregado1.nome}")
    JOptionPane.showMessageDialog(null,"O nome do empregado é ${empregado1.nome}\r\n" +
            "O cargo de ${empregado1.nome} é ${empregado1.cargo}\r\n" +
            "O salario é de ${empregado1.salario}")

    while (true) {
        val opcao = JOptionPane.showInputDialog("Digite uma das seguintes opções:\n" +
                "1) Promover\n" +
                "2) Dar aumento\n" +
                "3) Tirar férias\n" +
                "4) Sair")

        when (opcao) {
            "1" -> {
                empregado1.aumentarCargo()
                JOptionPane.showMessageDialog(null, "Parabéns, você subiu de cargo e agora o seu salário é R$ ${"%.2f".format(empregado1.salario)}")
            }
            "2" -> {
                empregado1.reajustarSalario()
                JOptionPane.showMessageDialog(null, "Parabéns, você recebeu um aumento e agora o seu salário é R$ ${"%.2f".format(empregado1.salario)}")
            }
            "3" -> {
                JOptionPane.showMessageDialog(null, "Você tirou férias e tem direito a R$ ${"%.2f".format(empregado1.tirarFerias())} de salário mais 13º!")
            }
            "4" -> {
                JOptionPane.showMessageDialog(null, "Até a próxima!")
                break
            }
            else -> {
                JOptionPane.showMessageDialog(null, "Opção inválida. Por favor, escolha uma opção válida.")
            }
        }
    }
}