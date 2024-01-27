import kotlin.math.min

class Relogio (var horas:Int= 0, var minutos:Int = 0, var segundos:Int = 0) {

    fun horaAtual():String {
        if (horas > 23 || horas < 0){
            horas = 0
        }
        if (minutos > 59 || minutos < 0){
            minutos = 0
        }
        if (segundos > 59 || segundos < 0){
            segundos = 0
        }

        var horass = horas.toString().padStart(2, '0')
        var minutoss = minutos.toString().padStart(2, '0')
        var segundoss = segundos.toString().padStart(2, '0')

        return "Agora são: ${horass}:${minutoss}:${segundoss}"

    }

    fun adicionarTempo(maisHoras: Int, maisMinutos: Int, maisSegundos: Int) {
        if (maisHoras <= 23){
            var formatH = maisHoras + horas
            horas = formatH
            if (formatH > 23){
                horas = formatH - 24
            }
        }
        if (maisMinutos <= 59){
            var formatM = maisMinutos + minutos
            minutos = formatM
            if (formatM > 59){
                minutos = formatM - 60
            }
        }
        if (maisSegundos <= 59){
            var formatS = maisSegundos + segundos
            segundos = formatS
            if (formatS > 59){
                segundos = formatS - 60
            }
        }
    }
}