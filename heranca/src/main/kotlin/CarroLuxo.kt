class CarroLuxo : Carro() {

    override fun getReacaoPessoas(): String {
        velocidade -= 3.0
        normalizarVelocidade()
        return "Noooossa! Que carrão esse $fabricante $modelo"
    }

    override fun getVelocidadeAceleracao(): Double {
        return 25.0
    }

    override fun getVelocidadeFrear(): Double {
        return 15.0
    }

    override fun getVelocidadeMaxima(): Double {
        return 100.0
    }
}