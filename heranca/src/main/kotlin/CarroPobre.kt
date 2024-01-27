class CarroPobre : Carro() {

    override fun getReacaoPessoas(): String {
        velocidade -= 3.0
        normalizarVelocidade()
        return "Nossa! essa $fabricante $modelo é mó Paia!"
    }

    override fun getVelocidadeAceleracao(): Double {
        return 2.3
    }

    override fun getVelocidadeFrear(): Double {
        return 5.4
    }

    override fun getVelocidadeMaxima(): Double {
        return 300.0
    }

}