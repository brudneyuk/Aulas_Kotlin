import javax.swing.JOptionPane

fun main() {
    val cofres = mutableListOf<Cofrinho>()

    val cofrinho1 = Cofrinho()

    cofrinho1.objetivo = JOptionPane.showInputDialog("Informe o objetivo do cofrinho 1")
    cofrinho1.meta = JOptionPane.showInputDialog("Informe o valor da meta do cofrinho 1").toDouble()

    cofres.add(cofrinho1)

    val cofrinho2 = Cofrinho()

    cofrinho2.objetivo = JOptionPane.showInputDialog("Informe o objetivo do cofrinho 2")
    cofrinho2.meta = JOptionPane.showInputDialog("Informe o valor da meta do cofrinho 2").toDouble()

    cofres.add(cofrinho2)

    val cofrinho3 = Cofrinho()

    cofrinho3.objetivo = JOptionPane.showInputDialog("Informe o objetivo do cofrinho 3")
    cofrinho3.meta = JOptionPane.showInputDialog("Informe o valor da meta do cofrinho 3").toDouble()

    cofres.add(cofrinho3)

        for (escolha in 1..3) {
            val escolha = JOptionPane.showInputDialog(
                """
        Em qual cofre quer mexer?
        1, 2 ou 3? Nenhum deles para encerrar o app.        
        """.trimIndent()
            ).toInt()

            if (escolha > 3 || escolha < 1){
                JOptionPane.showMessageDialog(null, "${cofrinho1.descrever()}")
                JOptionPane.showMessageDialog(null, "${cofrinho2.descrever()}")
                JOptionPane.showMessageDialog(null, "${cofrinho3.descrever()}")

                break
            }
            if (escolha == 1){
                cofrinho1.depositar(JOptionPane.showInputDialog("Informe quanto vai depositar do cofre 1").toDouble())


                cofrinho1.retirar(JOptionPane.showInputDialog("Informe quanto vai retirar do cofre 1").toDouble())
                JOptionPane.showMessageDialog(null, "${cofrinho1.descrever()}")
            }
            if (escolha == 2){
                cofrinho2.depositar(JOptionPane.showInputDialog("Informe quanto vai depositar do cofre 2").toDouble())


                cofrinho2.retirar(JOptionPane.showInputDialog("Informe quanto vai retirar do cofre 2").toDouble())
                JOptionPane.showMessageDialog(null, "${cofrinho2.descrever()}")
            }
            if (escolha == 3){
                cofrinho3.depositar(JOptionPane.showInputDialog("Informe quanto vai depositar do cofre 3").toDouble())


                cofrinho3.retirar(JOptionPane.showInputDialog("Informe quanto vai retirar do cofre 3").toDouble())
                JOptionPane.showMessageDialog(null, "${cofrinho3.descrever()}")
            }
        }
}