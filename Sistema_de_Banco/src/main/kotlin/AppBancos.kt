import java.time.LocalDate
import javax.swing.JOptionPane
import javax.swing.JOptionPane.showMessageDialog

fun main() {
    val gerente = Gerente()

    gerente.nome = "Vinius Gomes"
    gerente.email = "vini@banco.com"
    gerente.dataNascimento = LocalDate.of(2002, 12, 4)
    gerente.agencia = "Av Paulista"

    showMessageDialog(null, gerente.exibirInformacoes())

    val cliente1 = Cliente()

    cliente1.nome = "Junior João"
    cliente1.email = "junior@banco.com"
    cliente1.dataNascimento = LocalDate.of(1999, 1, 10)
    cliente1.numeroConta = "1234-Y"

    val cliente2 = Cliente()
    cliente2.nome = "Pedro Gonçalves"
    cliente2.email = "pedro@banco.com"
    cliente2.dataNascimento = LocalDate.of(1999, 1, 10)
    cliente2.numeroConta = "4321-B"

    showMessageDialog(null, cliente1.exibirInformacoes())
    showMessageDialog(null, cliente2.exibirInformacoes())


    val agencia = AgenciaBancaria()

    agencia.nome = "Safra"
    agencia.gerente = gerente
    agencia.adicionarCliente(cliente1)
    agencia.adicionarCliente(cliente2)

    showMessageDialog(null, agencia.detalhes())

}