import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit
import javax.swing.JOptionPane

fun main() {
    val hoje = LocalDate.now() // fornece a data atual


    val dataTexto = JOptionPane.showInputDialog("Insira sua data de nascimento")
    val dataNascimento  = LocalDate.parse(dataTexto, DateTimeFormatter.ofPattern("dd/MM/yyyy"))

    val anos = ChronoUnit.YEARS.between(dataNascimento, hoje)
    val dias = ChronoUnit.DAYS.between(dataNascimento, hoje)


    println("Idade em anos: $anos")
    println("Idade em dias: $dias")

}