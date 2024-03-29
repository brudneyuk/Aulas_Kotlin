open class Cachorro{
    lateinit var nome: String
    var peso: Double = 0.0
    var idade: Int = 0


    open fun comer(comida: String, quantidadeGramas: Double): String {
        peso += quantidadeGramas / 1000

        return "Cachorro comendo $comida"
    }

    open fun correAoVerMoto(): Boolean {
        return false
    }

    open fun getPrecoMedio(): Double {
        return 100.0
    }

    open fun getDescricao(): String {
        return "O cachorro $nome tem $idade anos e pesa ${peso}Kg"
    }

}