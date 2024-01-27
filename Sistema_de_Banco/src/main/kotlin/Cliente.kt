class Cliente: PessoaFisica() {
    var numeroConta: String = ""

    override fun exibirInformacoes(): String {
        return """
             ${super.exibirInformacoes()}
             Número da conta: $numeroConta
         """.trimIndent()
    }
}