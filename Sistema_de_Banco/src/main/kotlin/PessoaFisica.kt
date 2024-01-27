import java.time.LocalDate
import java.time.Period

open class PessoaFisica {
    var nome: String = ""
    var email: String = ""
    var dataNascimento: LocalDate = LocalDate.of(1900, 1, 1)

    fun getIdade(): Int{
        var hoje = LocalDate.now()
        var idade = Period.between(dataNascimento, hoje)
        // Period.between ele conta o tempo entre o dataNascimente de data de hoje
        return idade.years // .year ele retorna como years
    }

    open fun exibirInformacoes(): String{
        return """
            Nome: $nome
            Email: $email
            Idade:  ${getIdade()}
        """.trimIndent()
    }
}