import javax.swing.JOptionPane

fun main() {
    val cachorro1 = Cachorro()
    val cachorro2 = CachorroRaca()
    val cachorro3 = CachorroViraLata()

    cachorro1.nome = JOptionPane.showInputDialog("Nome Cachorro?")
    cachorro1.peso = JOptionPane.showInputDialog("peso Cachorro?").toDouble()
    cachorro1.idade = JOptionPane.showInputDialog("Idade Cachorro?").toInt()

    JOptionPane.showMessageDialog(null, cachorro1.getDescricao())


    cachorro2.nome = JOptionPane.showInputDialog("Nome Cachorro de Raça?")
    cachorro2.peso = JOptionPane.showInputDialog("peso Cachorro de Raça?").toDouble()
    cachorro2.idade = JOptionPane.showInputDialog("Idade Cachorro de Raça?").toInt()

    JOptionPane.showMessageDialog(null, cachorro2.getDescricao())


    cachorro3.nome = JOptionPane.showInputDialog("Nome Cachorro Viralata?")
    cachorro3.peso = JOptionPane.showInputDialog("peso Cachorro Viralata?").toDouble()
    cachorro3.idade = JOptionPane.showInputDialog("Idade Cachorro Viralata?").toInt()

    JOptionPane.showMessageDialog(null, cachorro3.getDescricao())

    val Cachorro = "O cachorro ${cachorro1.nome} ${if (cachorro1.correAoVerMoto()) "corre" else "não corre"} atrás de uma moto quando a vê"


    val CachorroRaca = "O cachorro ${cachorro2.nome} ${if (cachorro2.correAoVerMoto()) "corre" else "não corre"} atrás de uma moto quando a vê"

    val CachorroViraLata = "O cachorro ${cachorro3.nome} ${if (cachorro3.correAoVerMoto()) "corre" else "não corre"} atrás de uma moto quando a vê"

    JOptionPane.showMessageDialog(null, Cachorro)
    JOptionPane.showMessageDialog(null, CachorroRaca)
    JOptionPane.showMessageDialog(null, CachorroViraLata)

    var comida = JOptionPane.showInputDialog("Digite o alimento do ${cachorro1.nome}")
    var gramas = JOptionPane.showInputDialog("Digite quantas gramas o ${cachorro1.nome} irá comer").toDouble()
    JOptionPane.showMessageDialog(null, cachorro1.comer(comida, gramas))
    JOptionPane.showMessageDialog(null, cachorro1.getDescricao())

    var comida2 = JOptionPane.showInputDialog("Digite o alimento do ${cachorro2.nome}")
    var gramas2 = JOptionPane.showInputDialog("Digite quantas gramas o ${cachorro2.nome} irá comer").toDouble()
    JOptionPane.showMessageDialog(null, cachorro2.comer(comida2, gramas2))
    JOptionPane.showMessageDialog(null, cachorro2.getDescricao())

    var comida3 = JOptionPane.showInputDialog("Digite o alimento do ${cachorro3.nome}")
    var gramas3 = JOptionPane.showInputDialog("Digite quantas gramas o ${cachorro3.nome} irá comer").toDouble()
    JOptionPane.showMessageDialog(null, cachorro3.comer(comida3, gramas3))
    JOptionPane.showMessageDialog(null, cachorro3.getDescricao())
}