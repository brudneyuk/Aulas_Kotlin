package Agregação1

import agregacao.Fruta

class Turma {
    var nome: String = ""

    val alunos = mutableListOf<Aluno>()

    fun adicionarAluno(novoAluno: Aluno) {
        alunos.add(novoAluno)
    }
}