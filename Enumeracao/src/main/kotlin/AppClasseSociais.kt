import java.lang.Exception
import javax.swing.JOptionPane

fun main() {
    val rendaEstagiario = -2_200.0
    try {
    val classeEstagiario = ClasseSocial.aPartirDaRenda(rendaEstagiario)
    println("A classe social de estagiário é ${classeEstagiario.descricao}")
    } catch (excecao:Exception) {
        println(excecao.message)
    }

    try {
    val rendaX = JOptionPane.showInputDialog("Renda?").toDouble()
    val classeX = ClasseSocial.aPartirDaRenda(rendaX)
    println("A classe é ${classeX.descricao}")

    }catch (excecao:Exception){
        println(excecao.message)
    }

}