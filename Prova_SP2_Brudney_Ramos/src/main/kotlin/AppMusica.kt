import javax.swing.JOptionPane
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.Period
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit

fun main() {
    val repositorio = Repositorio()
    repositorio.iniciar()
    repositorio.criarTabela()
    val musica = Musica()

    while (true){
        var escolha = 0

        escolha = JOptionPane.showInputDialog("""
            1- Adicionar nova música
            2- Buscar por id
            3- Excluir música por id
            4- Sair
        """.trimIndent()).toInt()

        if (escolha == 1){
            musica.titulo = JOptionPane.showInputDialog("Digite o titulo da musica")
            musica.artista = JOptionPane.showInputDialog("Digite o artista da musica")
            repositorio.cadastrar(musica)
            println(repositorio.getUltimoCodigo())
        }

        if (escolha == 2){
            var  tempo = musica.dataCriacao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))

            var id = JOptionPane.showInputDialog("Qual das ${repositorio.getUltimoCodigo()} você gostaria de ver?").toInt()
            repositorio.buscar(id)
            JOptionPane.showMessageDialog(null,"""
                Musica com o id: $id
                Titulo: ${musica.titulo}
                Artista: ${musica.artista}
                Data Criação: $tempo
            """.trimIndent())
        }

        if (escolha == 3){
            var id = JOptionPane.showInputDialog("Qual das ${repositorio.getUltimoCodigo()} você gostaria de excluir?").toInt()
            repositorio.buscar(id)
            JOptionPane.showMessageDialog(null,"A musica ${musica.titulo}, do(a) artista ${musica.artista} foi excluida!")
//            repositorio.excluir(id)

            var diminuindo = repositorio.getUltimoCodigo() - 1
            println(diminuindo)
        }

        if (escolha == 4){
            break
        }
    }
}