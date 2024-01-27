class Banco (
    var nome:String,
    private var saldo:Double,
) {

    fun getSaldo() : Double {
        return saldo
    }

    fun Depositar(valor: Double)  {
        if (valor > 0.0) {
            saldo += valor
        }
    }

    fun SetSaldo (NovoValor: Double) {
        saldo = NovoValor
    }

    fun Retirar(valor: Double) : Double {
        if (valor <= this.saldo) {
            this.saldo -= valor
        }
        return saldo
    }

}