import Composição1.Autor
import Composição1.Livro
import javax.swing.JOptionPane

fun main() {
    val autores = mutableListOf<Autor>()

    val autor1 = Autor()
    val autor2 = Autor()
    val autor3 = Autor()
    autor1.nome = "Kat Falls"
    autor1.idade = 80

    autores.add(autor1)

    autor2.nome = "Jeremias"
    autor2.idade = 12

    autores.add(autor2)


    autor3.nome = "Jacaan"
    autor3.idade = 50

    autores.add(autor3)

    val livro1 = Livro()
    val livro2 = Livro()
    val livro3 = Livro()

    livro1.titulo = "Dark Life"
    livro1.anoPublicacao = 2011
    livro1.autor = autor1.nome

    autor1.Addlivros(livro1.titulo, livro1.anoPublicacao, livro1.autor)

    livro2.titulo = "SCRUM"
    livro2.anoPublicacao = 1090
    livro2.autor = autor2.nome

    autor2.Addlivros(livro2.titulo, livro2.anoPublicacao, livro2.autor)

    livro3.titulo = "Sprint2"
    livro3.anoPublicacao = 2020
    livro3.autor = autor3.nome

    autor3.Addlivros(livro3.titulo, livro3.anoPublicacao, livro3.autor)

    autores.forEach {
        it.livros.forEach{
            JOptionPane.showMessageDialog(null, """
                Título do livro: ${it.titulo}
                Ano: ${it.anoPublicacao}
                Nome do autor: ${it.autor}
            """.trimIndent())
        }
    }
}