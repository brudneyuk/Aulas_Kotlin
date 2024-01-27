fun main() {
    val banco = Banco("Reis", 150000.02)

    println("Depositando 2 reais")
    banco.Depositar(2.0)
    println("Saldo: ${banco.getSaldo()}")

    println("Retirando 100 mil")
    val saldoAposRetirada = banco.Retirar(100000.0)
    println("Saldo: ${"%.2f".format(saldoAposRetirada)}")
}