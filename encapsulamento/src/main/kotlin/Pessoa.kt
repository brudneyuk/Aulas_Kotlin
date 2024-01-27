class Pessoa (var nome: String, private var idade: Int) {

    fun FazerAniversario() {
        idade += 1
    }

    fun getIdade() : Int {
        return idade
    }
}