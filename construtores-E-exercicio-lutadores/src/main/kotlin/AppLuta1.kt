import javax.swing.JOptionPane

fun main() {
    val lutador11 = Lutador1()

    lutador11.nome = JOptionPane.showInputDialog("Vamos começar a Luta! Nome do 1º lutador")
    lutador11.forcaAtaque = JOptionPane.showInputDialog("Força Ataque do lutador 1").toDouble()
    lutador11.forcaDefesa = JOptionPane.showInputDialog("Força de Defesa do lulatador 1").toDouble()

    val lutador22 = Lutador1()

    lutador22.nome = JOptionPane.showInputDialog("Vamos começar a Luta! Nome do 2º lutador")
    lutador22.forcaAtaque = JOptionPane.showInputDialog("Força Ataque do lutador 2").toDouble()
    lutador22.forcaDefesa = JOptionPane.showInputDialog("Força de Defesa do lulatador 2").toDouble()

    //g1
    for (round in 1..3) {
        val batedor = JOptionPane.showInputDialog(
            """
        1 - Lutador 1 bate no Lutador 2
        2 - Lutador 2 bate no Lutador 1            
        """.trimIndent()
        ).toInt()

        if (batedor == 1) {
            lutador22.apanhar(lutador11)
        } else {
            lutador11.apanhar(lutador22)
        }
    }

    JOptionPane.showMessageDialog(null, lutador11.descrever())
    JOptionPane.showMessageDialog(null, lutador22.descrever())

    //g5
    for (round in 1..3) {
        val batedor = JOptionPane.showInputDialog(
            """
         1 - Lutador 1 se concentra
         2 - Lutador 2 se concentra
         NDA - Nenhum se concentra
        """.trimIndent()
        ).toInt()

        if (batedor == 1) {
            lutador22.concentar()
        } else {
            lutador11.concentar()
        }
    }

    JOptionPane.showMessageDialog(null, lutador11.descrever())
    JOptionPane.showMessageDialog(null, lutador22.descrever())

    //g1
    for (round in 1..3) {
        val batedor = JOptionPane.showInputDialog(
            """
        1 - Lutador 1 bate no Lutador 2
        2 - Lutador 2 bate no Lutador 1            
        """.trimIndent()
        ).toInt()

        if (batedor == 1) {
            lutador22.apanhar(lutador11)
        } else {
            lutador11.apanhar(lutador22)
        }
    }

    JOptionPane.showMessageDialog(null, lutador11.descrever())
    JOptionPane.showMessageDialog(null, lutador22.descrever())

    //g5
    for (round in 1..3) {
        val batedor = JOptionPane.showInputDialog(
            """
         1 - Lutador 1 se concentra
         2 - Lutador 2 se concentra
         NDA - Nenhum se concentra
        """.trimIndent()
        ).toInt()

        if (batedor == 1) {
            lutador22.concentar()
        } else {
            lutador11.concentar()
        }
    }

    JOptionPane.showMessageDialog(null, lutador11.descrever())
    JOptionPane.showMessageDialog(null, lutador22.descrever())

    //g1
    for (round in 1..3) {
        val batedor = JOptionPane.showInputDialog(
            """
        1 - Lutador 1 bate no Lutador 2
        2 - Lutador 2 bate no Lutador 1            
        """.trimIndent()
        ).toInt()

        if (batedor == 1) {
            lutador22.apanhar(lutador11)
        } else {
            lutador11.apanhar(lutador22)
        }
    }

    JOptionPane.showMessageDialog(null, lutador11.descrever())
    JOptionPane.showMessageDialog(null, lutador22.descrever())

    //g5
    for (round in 1..3) {
        val batedor = JOptionPane.showInputDialog(
            """
         1 - Lutador 1 se concentra
         2 - Lutador 2 se concentra
         NDA - Nenhum se concentra
        """.trimIndent()
        ).toInt()

        if (batedor == 1) {
            lutador22.concentar()
        } else {
            lutador11.concentar()
        }
    }

    JOptionPane.showMessageDialog(null, lutador11.descrever())
    JOptionPane.showMessageDialog(null, lutador22.descrever())

    //g1
    for (round in 1..3) {
        val batedor = JOptionPane.showInputDialog(
            """
        1 - Lutador 1 bate no Lutador 2
        2 - Lutador 2 bate no Lutador 1            
        """.trimIndent()
        ).toInt()

        if (batedor == 1) {
            lutador22.apanhar(lutador11)
        } else {
            lutador11.apanhar(lutador22)
        }

        JOptionPane.showMessageDialog(null, lutador11.descrever())
        JOptionPane.showMessageDialog(null, lutador22.descrever())
    }


    //g5
    for (round in 1..3) {
        val batedor = JOptionPane.showInputDialog(
            """
         1 - Lutador 1 se concentra
         2 - Lutador 2 se concentra
         NDA - Nenhum se concentra
        """.trimIndent()
        ).toInt()

        if (batedor == 1) {
            lutador22.concentar()
        } else {
            lutador11.concentar()
        }
    }


    var vencedor = "Nenhum(empate)"

    if (lutador11.vidaAtual > lutador22.vidaAtual){
        vencedor = lutador11.nome
    }
    if (lutador22.vidaAtual > lutador11.vidaAtual){
        vencedor = lutador22.nome
    }
    JOptionPane.showMessageDialog(null, "O vencedor é $vencedor!")
}