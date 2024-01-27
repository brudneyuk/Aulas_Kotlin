import java.lang.IllegalArgumentException
import javax.swing.JOptionPane
import javax.swing.JOptionPane.showInputDialog
import javax.swing.JOptionPane.showMessageDialog

fun main() {
    println("Estações disponíveis:")
    println(Estacao.values())

    Estacao.values().forEach {
        println(it)
    }

    val menu = """
        Escolha uma das opções:
        VERAO, OUTONO, INVERNO ou PRIMAVERA
    """.trimIndent()

    val escolha = showInputDialog(menu)

    // .valueOf() -> BUSCA um valor na classe enum
    // deve-se informar uma String que seja EXATAMENTE
    // igual a um dos valores da enum
    // Caso o valor não exista, ocorre um erro
    try {
    val estacaoEscolhida:Estacao = Estacao.valueOf(escolha)

        JOptionPane.showMessageDialog(null,"Você escolher $estacaoEscolhida")

    } catch (excecao:Exception) {
        // excecao:Exception -> serve para se caso não saiba o erro
        showMessageDialog(null, "Estação Inválida! ${excecao.message}")
    }

    showMessageDialog(null, "Aplicação executou com sucesso!")
}