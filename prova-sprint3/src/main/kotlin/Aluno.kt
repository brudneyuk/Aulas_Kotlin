class Aluno: Pessoa() {
    var matricula : String = ""

    override fun exibirInformacoes(): String {
        return """
            ${super.exibirInformacoes()}
            Matrícula: $matricula
        """.trimIndent()
    }
}