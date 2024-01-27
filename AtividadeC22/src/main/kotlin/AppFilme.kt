import javax.swing.JOptionPane

fun main() {

    //Criamos um objeto do tipo Conexao e invocamos seu método criarTabelas()
    Conexao.criarTabelas()

    val repositorio = Repositorio()
    repositorio.iniciar()

    while (true) {
        var escolha = JOptionPane.showInputDialog("""
            1 - Adicionar Filme.
            2 - Consultar Filme.
            3 - Excluir Filme.
            4 - Sair.
        """.trimIndent()).toInt()
        if (escolha == 1){

            val novoFilme = Filme()
            novoFilme.nome = JOptionPane.showInputDialog("Qual é o nome do filme??")
            novoFilme.diretor = JOptionPane.showInputDialog("Qual é o diretor do filme?")
            var oscar = JOptionPane.showInputDialog("Foi indicado ao oscar?")
            if (oscar.uppercase() == "S"){
                novoFilme.indicadoOscar = true
            }
            println(novoFilme.indicadoOscar)
            novoFilme.custoProducao = JOptionPane.showInputDialog("Quanto foi o custo de produção?").toDouble()

            repositorio.cadastrar(novoFilme)
        }

        if (escolha == 2){
            var ultimo = repositorio.getUltimoCodigo()
            var codigo = JOptionPane.showInputDialog("Consulte um filme! Digite de 1 a $ultimo").toInt()
            var nome = repositorio.recuperarNome(codigo)
            var diretor = repositorio.recuperarDiretor(codigo)
            var oscar = repositorio.recuperarOscar(codigo)
            println(oscar)
            var mensagem = ""
                if (oscar == true) {
                    mensagem = "sim"
                }
                else {
                    mensagem = "não"
                }
            var custo = repositorio.recuperarCusto(codigo)

            if (codigo >= 1 && codigo <= ultimo){
                JOptionPane.showMessageDialog(null, """
                    Filme com o id: $codigo
                    Nome: $nome
                    Diretor: $diretor
                    Indicado ao Oscar: $mensagem
                    Custo de produção: R$$custo
                """.trimIndent())
            }
        }
            if (escolha == 3){
                var ultimo = repositorio.getUltimoCodigo()
                var codigo = JOptionPane.showInputDialog("Exclua um filme! Digite de 1 a $ultimo").toInt()
                var nome = repositorio.recuperarNome(codigo)
                repositorio.excluir(codigo)
                if (codigo >= 1 && codigo <= ultimo){
                    JOptionPane.showMessageDialog(null, """
                    O filme $nome foi excluido
                """.trimIndent())
                } else {
                    JOptionPane.showMessageDialog(null, """
                        Filme inválido
                    """.trimIndent())
                }
                println(ultimo)
            }

            if (escolha == 4){
                JOptionPane.showMessageDialog(null, "Até a próxima! :)")
                break
            }
        }
    }