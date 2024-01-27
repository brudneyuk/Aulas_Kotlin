import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main() {
    /*
    LocalDate -> somente data
    LocalDateTime -> data e hora (até o milissegundos)
     */

    val hoje = LocalDate.now() // fornece a data atual
    println(hoje)

    val agora = LocalDateTime.now() // fornece a data e hora atuais
    println(agora)

    val nascimentoTexto = "2002-12-04"
    val dataNascimento = LocalDate.parse(nascimentoTexto)
    println(dataNascimento)

    val hojeBrasil = hoje.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))

    println(hojeBrasil)

    val dataDoUsuario = "31/12/2000" //poderia ser JOptionPane
    val dataConvertida = LocalDate.parse(dataDoUsuario, DateTimeFormatter.ofPattern("dd/MM/yyyy"))

    println(dataConvertida)


    val amanha = hoje.plusDays(1)
    println(amanha)
    println(hoje)

    val ontem = hoje.minusDays(1)
    println(ontem)

    val ha5anos = hoje.minusYears(5)
    println(ha5anos)

    val daquiMeiaHora = agora.plusMinutes(30)
    println(daquiMeiaHora)

    val ha15segundos = agora.minusSeconds(15)
    println(ha15segundos)


}