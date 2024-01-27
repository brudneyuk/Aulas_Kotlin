import java.util.ArrayList;
import java.util.List;

public class DisciplinaJ {

    String nome  = "";
    String anoSemestre = "";

    Professor professor = new Professor();
    List<Aluno> alunos = new ArrayList<>();

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public String detalhes(){
        return String.format("Nome: %s\nAno/Semestre: %s\nProfessor: %s\nQuantidade de alunos: %d",
                nome, anoSemestre, professor.getNome(), alunos.size());
    }
}
