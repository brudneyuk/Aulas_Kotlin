import javax.swing.JOptionPane

fun main() {
    var produto1 = Produto()

    produto1.nome = JOptionPane.showInputDialog("informe o nome do produto: ")
    produto1.preco = JOptionPane.showInputDialog("informe seu preço: ").toDouble()
    var brinde = JOptionPane.showInputDialog("informe se é brinde: \r\n1 - É brinde / 2 - Não é brinde").toInt()

    if (brinde == 1){
        produto1.brinde = true
    } else if (brinde == 2) {
        produto1.brinde = false
    }
    JOptionPane.showMessageDialog(null,"O produto ${produto1.nome} custa R$${String.format("%.2f",(produto1.preco))}")

}