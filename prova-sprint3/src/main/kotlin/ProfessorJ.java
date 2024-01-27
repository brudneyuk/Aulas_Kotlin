public class ProfessorJ extends PessoaJ {
    String especialidade = "";

    @Override
    public String exibirInformacoes() {
        return String.format("%s\nEspecialidade: %s",
                super.exibirInformacoes(), especialidade).replaceAll("\n[\\t ]+", "\n");
    }
}
