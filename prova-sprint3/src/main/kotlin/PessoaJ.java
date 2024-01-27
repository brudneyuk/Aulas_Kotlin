import java.time.LocalDate;
import java.time.Period;

public class PessoaJ {
    String nome = "";
    String email = "";
    LocalDate dataNascimento = LocalDate.of(2002, 12, 4);

    public int getIdade() {
        LocalDate atual = LocalDate.now();
        Period periodo = Period.between(dataNascimento, atual);
        return periodo.getYears();
    }

    public String exibirInformacoes() {
        return String.format("Nome: %s\nEmail: %s\nIdade: %d",
                nome, email, getIdade());
    }
}
