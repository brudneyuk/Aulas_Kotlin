package Agregação1

import javax.swing.JOptionPane

fun main() {
    val turmas = mutableListOf<Turma>()

    val aluno1 = Aluno()
    aluno1.nome = "Brudney"
    aluno1.matricula = "03231062"

    val aluno11 = Aluno()
    aluno11.nome = "Yan"
    aluno11.matricula = "03231009"

    val aluno2 = Aluno()
    aluno2.nome = "Alexandre"
    aluno2.matricula = "03231054"

    val aluno22 = Aluno()
    aluno22.nome = "Kaick"
    aluno22.matricula = "03231090"

    val aluno3 = Aluno()
    aluno3.nome = "Davi"
    aluno3.matricula = "03231068"

    val aluno33 = Aluno()
    aluno33.nome = "Erick"
    aluno33.matricula = "03231069"

    val turma1 = Turma()
    turma1.nome = "SIS"
    turmas.add(turma1)
    turma1.adicionarAluno(aluno1)
    turma1.adicionarAluno(aluno11)

    val turma2 = Turma()
    turma2.nome = "CCO"
    turmas.add(turma2)
    turma2.adicionarAluno(aluno2)

    val turma3 = Turma()
    turma3.nome = "ADS"
    turmas.add(turma3)
    turma3.adicionarAluno(aluno3)
    turma3.adicionarAluno(aluno22)
    turma3.adicionarAluno(aluno33)

    turmas.forEach {turmas ->
            JOptionPane.showMessageDialog(null, """
                Nome da turma: ${turmas.nome} 
                Quantidade de alunos: ${turmas.alunos.size}
            """.trimIndent())
    }

    JOptionPane.showMessageDialog(null, """
        Nome da Turma: ${turma1.nome}
        Nome do aluno: ${aluno1.nome}
        Matricula: ${aluno1.matricula}
    """.trimIndent())

    JOptionPane.showMessageDialog(null, """
        Nome da Turma: ${turma2.nome}
        Nome do aluno: ${aluno2.nome}
        Matricula: ${aluno2.matricula}
    """.trimIndent())

    JOptionPane.showMessageDialog(null, """
        Nome da Turma: ${turma3.nome}
        Nome do aluno: ${aluno3.nome}
        Matricula: ${aluno3.matricula}
    """.trimIndent())

}