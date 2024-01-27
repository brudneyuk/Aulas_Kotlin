import javax.swing.JOptionPane

fun main() {
    val valor_base_por_km : Double = JOptionPane.showInputDialog("Me diga o valor em R$ por KM:").toDouble()
    val distancia_corrida = JOptionPane.showInputDialog("Me diga a distância da próxima corrida:").toInt()
    val volume = JOptionPane.showInputDialog("Me diga o volume de solicitações (0 a 10):").toInt()
    val caso1 = valor_base_por_km * distancia_corrida
    val caso2 = caso1 * 1.30
    val caso3 = caso1 * 1.80

    if (volume < 0.0
        || volume > 10.0){
        Exibirtxt("volume inválido")
    }
    when (volume) {
        in 0..2 -> Exibirtxt("O valor da viagem é de: $caso1")
        in 3..7 -> Exibirtxt("O valor da viagem é de: $caso2")
        in 8..10 -> Exibirtxt("O valor da viagem é de: $caso3")
    }
}