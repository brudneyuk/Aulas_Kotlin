import javax.swing.JOptionPane

fun main() {
    var nome_linha = JOptionPane.showInputDialog("Digite o nome da linha")
    var menor_tempo = JOptionPane.showInputDialog("Digite o menor tempo de volta (em min):").toInt()
    var maior_tempo = JOptionPane.showInputDialog("Digite o maior tempo de volta (em min):").toInt()

    Exibirtxt("A linha $nome_linha leva em média ${Medir_tempo(menor_tempo, maior_tempo)} minutos/volta")
}

fun Medir_tempo(menor_tempo: Int, maior_tempo: Int): Int {
    return (menor_tempo + maior_tempo) / 2
}