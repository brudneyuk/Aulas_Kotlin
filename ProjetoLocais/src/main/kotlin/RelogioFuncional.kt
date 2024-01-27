import kotlin.concurrent.timer

class RelogioFuncional {
    var horas:Int = 0
    var minutos:Int = 0
    var segundos:Int = 0

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

    fun adicionarTempo() {
        if (segundos <= 59){
            segundos++
            if (segundos > 59){
                segundos -= 60
                if (minutos <= 59){
                    minutos++
                    if (minutos > 59){
                        minutos -= 60
                        if (horas <= 23){
                            horas++
                        }
                    }
                }
            }
            Thread.sleep(1000)
        }
    }
}