class Gerente: PessoaFisica() { // criando subclasse instanciando uma super classe
    var agencia: String = ""

    override fun exibirInformacoes(): String {
        return """
             ${super.exibirInformacoes()}
             Agência: $agencia
         """.trimIndent()
    }
}