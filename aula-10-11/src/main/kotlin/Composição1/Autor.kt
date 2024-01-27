package Composição1

class Autor {
    var nome:String = ""
    var idade:Int= 0

    val livros = mutableListOf<Livro>()

    fun Addlivros(
        titulo: String,
        anoPublicacao: Int,
        autor: String
    ) {
       val novoLivro = Livro()
        novoLivro.titulo = titulo
        novoLivro.anoPublicacao = anoPublicacao
        novoLivro.autor = autor

        livros.add(novoLivro)
    }
}