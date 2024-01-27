class CachorroViraLata : Cachorro() {

    override fun comer(comida: String, quantidadeGramas: Double): String {
        peso += (quantidadeGramas / 1000) * 1.1
        return "Cachorro Viralata comendo $comida"
    }

    override fun getPrecoMedio(): Double {
        return 0.0
    }

    override fun correAoVerMoto(): Boolean {
        return true
    }
}