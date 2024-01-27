class AgenciaBancaria {
    var nome: String = ""
    var gerente = Gerente()
    var cliente = mutableListOf<Cliente>()

    fun adicionarCliente(clientes: Cliente){
        cliente.add(clientes)
    }

    fun detalhes(): String{
        return """
            Nome: $nome
            Gerente: ${gerente.nome}
            Quantidade de Clientes: ${cliente.size}
        """.trimIndent()
    }
}