class Carro (var modelo: String,
             private var ligado: Boolean,
             private var velocidade: Double) {


    fun ligar(){
        ligado = true
    }

    fun desligar() {
        if (velocidade == 0.0){
            ligado = false
        }
    }

    fun acelerar() : Double{
        if (ligado){

        if (velocidade == 0.0) {
            velocidade = 10.0
        }else {
            velocidade *= 1.25
        }

        if (velocidade > 180.0){
            velocidade = 180.0
        }

        }
        return velocidade
    }

    fun freiar() : Double {
        if (ligado) {
            velocidade -= 3
            if (velocidade < 0.0) {
                velocidade = 0.0
            }
        }
            if (ligado == false) {
                velocidade = 0.0
            }
            return velocidade
        }


    fun getVelocidade() : Double {
        return velocidade
    }

}