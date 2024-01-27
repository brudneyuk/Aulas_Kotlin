import javax.swing.JOptionPane


fun main() {

    val repository = PizzaRepository()
    repository.iniciar()
    repository.criarTabela()

    val codigo =
        JOptionPane.showInputDialog("Digite qual pizza você quer buscar:")
            .toInt()
}