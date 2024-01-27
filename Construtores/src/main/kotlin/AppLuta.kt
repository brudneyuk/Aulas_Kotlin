import javax.swing.JOptionPane

fun main() {

    JOptionPane.showMessageDialog(null, "Vamos começar a luta")

    val lutador1 = Lutador()

    lutador1.nome = JOptionPane.showInputDialog("Informe o nome do 1° lutador")
    lutador1.forcaAtaque  = JOptionPane.showInputDialog("Informe a força de ataque do 1° lutador").toDouble()
    lutador1.forcaDefesa  = JOptionPane.showInputDialog("Informe a força de defesa do 1° lutador").toDouble()

    val lutador2 = Lutador()

    lutador2.nome = JOptionPane.showInputDialog("Informe o nome do 2° lutador")
    lutador2.forcaAtaque  = JOptionPane.showInputDialog("Informe a força de ataque do 2° lutador").toDouble()
    lutador2.forcaDefesa  = JOptionPane.showInputDialog("Informe a força de defesa do 2° lutador").toDouble()

    JOptionPane.showMessageDialog(null, "1 - Lutador 1 bate no Lutador 2\n\r" +
                                        "2 - Lutador 2 bate no Lutador 1")
    for (round in 1..3) {
        val batedor = JOptionPane.showInputDialog("""
            """

        )
    }


}