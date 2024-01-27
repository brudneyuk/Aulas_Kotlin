import org.springframework.jdbc.core.BeanPropertyRowMapper
import org.springframework.jdbc.core.JdbcTemplate
import javax.swing.JOptionPane

/*
Esta classe irá abstrair os métodos
de acesso à tabela pizza

(insert, select, delete, update)

Criamos sempre 1 Repositorio para cada tabela
 */

class Repositorio {

    lateinit var jdbcTemplate: JdbcTemplate

    fun iniciar() {
        // aqui usamos !! porque está com ? na Conexao
        // isso sisgnifica que aceitamos que pode ocorrer um erro
        // já que o jdbcTemplate pode estar nulo (null)
        jdbcTemplate = Conexao.jdbcTemplate!!
    }

    fun cadastrar(novoFilme: Filme) {
        jdbcTemplate.update("""
           insert into filme (nome, diretor, indicadoOscar, custoProducao)
           values
            ('${novoFilme.nome}', '${novoFilme.diretor}', ${novoFilme.indicadoOscar}, ${novoFilme.custoProducao})
        """)
    }

    fun getUltimoCodigo():Int {
        /*
        queryForObject -> usamos quando a consulta retorna 1 e somente 1 linha!
        Int::class.Java -> indica que o resultado será convertido num objeto do tipo Int
        ::class.java -> Sempre que mencionamos uma classe, fazemos as
         */
        val ultimoCodigo = jdbcTemplate.queryForObject(
            """
                select max(id) from filme 
                """,Int::class.java
        )
        return  ultimoCodigo
    }

    fun excluir(codigo:Int):Boolean {
        val atualizados = jdbcTemplate.update("""
        delete filme where id = $codigo
        """)

        return atualizados == 1
    }

    fun recuperar(codigo: Int):Filme {
        val filme = jdbcTemplate.queryForObject("""
            select * from filme where id = $codigo
        """, BeanPropertyRowMapper(Filme::class.java))

        return filme
    }

    fun recuperarNome(codigo: Int): String? {
        val nome = jdbcTemplate.queryForObject(
            "select nome from filme where id = $codigo",
            String::class.java
        )

        return nome
    }

    fun recuperarDiretor(codigo: Int):String {
        val diretor = jdbcTemplate.queryForObject(
            "select diretor from filme where id = $codigo",
            String::class.java
        )

        return diretor
    }

    fun recuperarOscar(codigo: Int): Boolean {
        val indicadoOscar = jdbcTemplate.queryForObject("""
        select indicadoOscar from filme where id = $codigo
    """, Boolean::class.java)

        return indicadoOscar ?: false
    }

    fun recuperarCusto(codigo: Int): Double? {
        val custo = jdbcTemplate.queryForObject(
            "select custoProducao from filme where id = $codigo",
            Double::class.java
        )

        return custo
    }

    fun atualizarPreco(codigo: Int, novoPreco: Double):Boolean {
        val atualizados = jdbcTemplate.update("""
        update filme set preco = $novoPreco
        where 
        codigo = $codigo
        and quantidade > 0
        """)

        return atualizados == 1
    }
}