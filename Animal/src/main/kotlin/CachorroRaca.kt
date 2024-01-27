class CachorroRaca : Cachorro(){

    override fun comer(comida: String, quantidadeGramas: Double): String {
        peso += (quantidadeGramas / 1000) * 0.5
        return "Cachorro de Raça comendo $comida"
    }

    override fun getPrecoMedio(): Double {
        return 2000.0
    }

}