/*
Aqui a classe possui um CONSTRUTOR
 */
class Estudantes(
    var nome: String,
    var media: Double,
    var frequencia: Double,
) {
    val listaAtividade = mutableListOf<String>()

    fun aprovou():Boolean {
        return media >= 6.0 && frequencia >= 75.0
    }


    fun registrarAtividade(nomeAtividade:String) {
        if (listaAtividade.size < 3) {
            media += 0.15
            listaAtividade.add(nomeAtividade)
        }
    }
}