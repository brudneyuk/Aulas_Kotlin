import java.time.LocalDate
import javax.swing.JOptionPane

fun main() {
    val professor = Professor()

    professor.nome = "Janine Ramos"
    professor.email = "janine@prof.com"
    professor.dataNascimento = LocalDate.of(1994, 3, 5)
    professor.especialidade = "Algoritimo"

    val aluno1 = Aluno()

    aluno1.nome = "Brudney Ramos"
    aluno1.email = "brudney.ramosjr@sptech.school"
    aluno1.dataNascimento = LocalDate.of(2002, 12, 4)
    aluno1.matricula = "03231062"

    val aluno2 = Aluno()

    aluno2.nome = "Juliana Santos"
    aluno2.email = "juliana.santos@sptech.school"
    aluno2.dataNascimento = LocalDate.of(1992, 5, 5)
    aluno2.matricula = "03231009"

    JOptionPane.showMessageDialog(null, professor.exibirInformacoes())
    JOptionPane.showMessageDialog(null, aluno1.exibirInformacoes())
    JOptionPane.showMessageDialog(null, aluno2.exibirInformacoes())

    val disciplina = Disciplina()

    disciplina.nome = professor.especialidade
    disciplina.anoSemestre = "2023/2"
    disciplina.professor = professor
    disciplina.adicionarAluno(aluno1)
    disciplina.adicionarAluno(aluno2)

    JOptionPane.showMessageDialog(null, disciplina.detalhes())
}