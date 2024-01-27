import javax.swing.JOptionPane

fun main() {
    var ki = JOptionPane.showInputDialog("Me fale o ki de um Super Sayajin:").toInt()

    Exibirtxt("O KI do SSJ é: ${SSJ(ki)} \r\n" +
            "O KI SSJ2 é: ${SSJ2(ki)} \r\n" +
            "O KI SSJ2 é ${SSJ3(ki)} \r\n" +
            "O KI GOD é ${GOD(ki)} \r\n")
}
fun SSJ(ki:Int): Int {
    return ki * 50
}
fun SSJ2(ki:Int): Int {
    return ki * 100
}
fun SSJ3(ki:Int): Int {
    return  ki * 200
}
fun GOD(ki:Int): Int {
    return ki * 500
}