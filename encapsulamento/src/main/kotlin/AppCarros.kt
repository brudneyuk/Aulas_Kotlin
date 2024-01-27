import javax.swing.JOptionPane

fun main() {
    val carro = Carro("Uno com Escada", false, 0.0)

    carro.ligar()

    carro.acelerar()
    carro.acelerar()
    carro.acelerar()
    carro.freiar()
    carro.freiar()
    println("%.2f".format(carro.getVelocidade()))
    JOptionPane.showMessageDialog(null, "Você está a ${"%.2f".format(carro.getVelocidade())} Km/h, acelera mais")
    for (i in 1..15){
        carro.acelerar()
    }
    JOptionPane.showMessageDialog(null, "Você está a ${"%.2f".format(carro.getVelocidade())} Km/h, diminui ai")

    if (carro.getVelocidade() > 0.0) {
        while (true){
            carro.freiar()
        }
    }
}