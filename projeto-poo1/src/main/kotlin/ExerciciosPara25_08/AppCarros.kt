import ExerciciosPara25_08.Carro
import atividade_em_sala.Heroi
import javax.swing.JOptionPane

fun main() {
    /*
    Aqui estamos CRIANDO
    um objeto do tipo atividade_em_sala.Heroi
    "faça-se um atividade_em_sala.Heroi! seu nome em memória será 'heroi1'"
     */

    val carro1 = Carro()

    carro1.modelo = JOptionPane.showInputDialog("Informe o modelo do carro")
    carro1.marcha = 1
    carro1.ligado = false
    carro1.km = 0

        JOptionPane.showMessageDialog(null, "O 1º carro é um ${carro1.modelo} e está na marcha ${carro1.marcha}")

    fun verificar() {
        if (carro1.ligado == true) {
            JOptionPane.showMessageDialog(null, "O ${carro1.modelo} está ligado")
        }
    }

    if (carro1.ligado == false){
        JOptionPane.showMessageDialog(null, "O ${carro1.modelo} está desligado")
        JOptionPane.showMessageDialog(null, "Ligando o ${carro1.modelo}")
        carro1.ligar()
        carro1.aumentarMarcha()
        carro1.aumentarMarcha()
        JOptionPane.showMessageDialog(null, "O 1º carro é um ${carro1.modelo} e está na marcha ${carro1.marcha}")
        verificar()
    }

    var distancia =  JOptionPane.showInputDialog("Informe a distância em km")

    if (carro1.ligado == true){
        JOptionPane.showMessageDialog(null, "O ${carro1.modelo} já está ligado")
        carro1.aumentarMarcha()
        carro1.fazerViagemCurta()
        JOptionPane.showMessageDialog(null, "O seu carro é um ${carro1.modelo}, está na marcha ${carro1.marcha} e já tem ${carro1.km} de km rodados")
        carro1.reduzirMarcha()
        carro1.fazerViagemCurta()
        JOptionPane.showMessageDialog(null, "Você queria rodar ${distancia} km e rodou ${carro1.km} km")
        JOptionPane.showMessageDialog(null, "O seu carro é um ${carro1.modelo}, está na marcha ${carro1.marcha} e já tem ${carro1.km} de km rodados")
    } else {
        JOptionPane.showMessageDialog(null, "Ligando o ${carro1.modelo}")
        carro1.ligar()
        carro1.aumentarMarcha()
        carro1.fazerViagemCurta()
        JOptionPane.showMessageDialog(null, "O seu carro é um ${carro1.modelo}, está na marcha ${carro1.marcha} e já tem ${carro1.km} de km rodados")
        carro1.reduzirMarcha()
        carro1.fazerViagemCurta()
        JOptionPane.showMessageDialog(null, "Você queria rodar ${distancia} km e rodou ${carro1.km} km")
        JOptionPane.showMessageDialog(null, "O seu carro é um ${carro1.modelo}, está na marcha ${carro1.marcha} e já tem ${carro1.km} de km rodados")
    }
}