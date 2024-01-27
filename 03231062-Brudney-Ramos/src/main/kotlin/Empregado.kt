import java.text.DecimalFormat

class Empregado {

    var nome:String = ""
    var cargo:String = "Estagiário"
    var salario:Double = 700.00

    fun reajustarSalario(){
        salario + (salario * 0.1)
    }

    fun aumentarCargo() {
        if (cargo == "Estagiario") {
            cargo = "Analista Junior"
            salario += salario * 0.2
        } else if (cargo == "Analista Junior") {
            cargo = "Analista Pleno"
            salario += salario * 0.3
        } else if (cargo == "Analista Pleno") {
            cargo = "Analista Senior"
            salario += salario * 0.4
        } else if (cargo == "Analista Senior") {
            cargo = "Tech Lead"
            salario += salario * 0.5
        }
    }

    fun tirarFerias():Double {
        return salario * 2
    }
}