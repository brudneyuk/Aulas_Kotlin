class Lutador1 {
    var nome:String = ""
    var forcaAtaque:Double = 0.0
    var forcaDefesa:Double = 0.0
    var vidaAtual:Double = 100.00
    var golpesSofridos = mutableListOf<Double>()

    fun concentar():Double {
        val aumento = 0.05 * vidaAtual
        vidaAtual += aumento
        return aumento
    }

    fun treinarLeve(semanas:Int) {
        forcaAtaque += semanas
    }

    fun treinarForte(semanas:Int) {
        forcaAtaque += (semanas * 3)
    }

    fun apanhar(quemBate: Lutador1) {
        if (quemBate.forcaAtaque > forcaDefesa) {
            vidaAtual -= quemBate.forcaAtaque - forcaDefesa
        }
        if (vidaAtual < 0.0) {
            vidaAtual = 0.0
        }
        golpesSofridos.add(quemBate.forcaAtaque)
    }

    fun descrever():String {
        return "Lutador ${nome} tem ${vidaAtual} de vida e já recebeu ${golpesSofridos.size} golpes"
    }
}