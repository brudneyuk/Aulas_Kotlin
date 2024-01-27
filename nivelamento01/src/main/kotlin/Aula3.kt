fun main() {
    var xicara = "Café"

    println("Você tem uma xicara com $xicara")
    println(entregarParaAlguem(xicara))
}

fun entregarParaAlguem(xicara: String): String {
    println("Você entregou o seu $xicara pra fulano esquentar e ele levou para o microondas")
    return esquentar(xicara)
}

fun esquentar(xicara: String): String {
    println("Esquentando xicara com $xicara...")
    println("Vrumm Vrumm Vrumm...")
    return "$xicara está quente!"
}