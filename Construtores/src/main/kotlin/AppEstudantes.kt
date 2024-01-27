import javax.swing.JOptionPane

fun main() {
    // Aqui instanciamos (criamos) um Estudante
    // usando seu construtor
    val estudante1 = Estudantes(nome = "Zé Ruela", 4.5, 60.0)
    println("E1: Nome: ${estudante1.nome}, ${estudante1.media}, ${estudante1.frequencia}")

    estudante1.nome = "Zé Buduia"
    println("E1: Nome: ${estudante1.nome}, ${estudante1.media}, ${estudante1.frequencia}")

//    A media não pode ser reatribuida (alterada)
//    porque ela foi criada como VAL
//    estudante1.media = 9.5

//    Cadastrando vários estudantes

//    criando uma lista que só aceita estudantes
    /*val estudantes = mutableListOf<Estudantes>()*/
/*
    for (contado in 0..4) {
        val nome = JOptionPane.showInputDialog("Digite o nome")
        val media = JOptionPane.showInputDialog("Digite a média").toDouble()
        val freq = JOptionPane.showInputDialog("Digite a frequência").toDouble()

//        Criando um estudante com os valores recém coletados
        var novoEstudante = Estudantes(nome, media, freq)

//        Inserindo o estudante na lista
        estudantes.add(novoEstudante)
    }

//    percorrendo a lista de estudante
    estudantes.forEach{
        val resultado = if (it.aprovou()) "Passou!" else "Não passou"

        JOptionPane.showMessageDialog(null, "${it.nome} - Resultado: ${resultado}")
    }*/

    val SimpaticoEstudante = Estudantes("Fulano", 8.0, 70.0)
    SimpaticoEstudante.registrarAtividade("teste 1")
    SimpaticoEstudante.registrarAtividade("catar coquinho")
    SimpaticoEstudante.registrarAtividade("enxugar gelo")
    SimpaticoEstudante.registrarAtividade("limpar carvão")
    println("Nova média: ${"%.2f".format(SimpaticoEstudante.media)}")
    println("Atividades: ${SimpaticoEstudante.listaAtividade}")
}