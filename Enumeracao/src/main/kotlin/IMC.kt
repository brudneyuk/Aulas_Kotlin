enum class IMC(val descricao:String, val minimo:Double,val maximo:Double, val acao: String)  {
    ABAIXO_IDEAL("Abaixo do peso", 0.0, 18.0, "Deve comer mais"),
    IDEAL("Normal", 20.0,25.0, "Deve Manter o peso"),
    ACIMA_IDEAL("Sobre-peso", 25.0, Double.MAX_VALUE, "Deve perder peso");

    companion object {
        fun aPartirDoPeso(imc: Double): IMC {
//            values().forEach {
//                if (imc >= it.minimo && imc < it.maximo) {
//                    return it
//                }
//            }
            throw ImcInvalidoException()
        }
    }
}