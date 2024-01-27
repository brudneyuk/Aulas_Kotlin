import java.time.LocalDate
import java.time.Period

open class Pessoa {
        var nome: String = ""
        var email: String = ""
        var dataNascimento: LocalDate = LocalDate.of(2002, 12, 4)

        fun getIdade(): Int{
                var atual = LocalDate.now()
                val idade = Period.between(dataNascimento, atual)
                return idade.years
        }

        open fun exibirInformacoes(): String{
                return """
        Nome: $nome
        Email: $email
        Idade: ${getIdade()}  
        """.trimIndent()
        }
}