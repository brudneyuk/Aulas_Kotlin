public class AlunoJ extends PessoaJ{
    String matricula = "";

    @Override
    public String exibirInformacoes() {
        return String.format("%s\nMatricula: %s",
                super.exibirInformacoes(), matricula).replaceAll("\n[\\t ]+", "\n");
    }
}
