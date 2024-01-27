import org.springframework.jdbc.core.BeanPropertyRowMapper
import org.springframework.jdbc.core.JdbcTemplate
import javax.swing.JOptionPane

/*
Esta classe irá abstrair os métodos
de acesso à tabela pizza

(insert, select, delete, update)

Criamos sempre 1 Repositorio para cada tabela
 */

class PizzaRepositorio {

    lateinit var jdbcTemplate: JdbcTemplate

    fun iniciar() {
        // aqui usamos !! porque está com ? na Conexao
        // isso sisgnifica que aceitamos que pode ocorrer um erro
        // já que o jdbcTemplate pode estar nulo (null)
        jdbcTemplate = Conexao.jdbcTemplate!!
    }

    fun cadastrar(novaPizza: Pizza) {
        jdbcTemplate.update("""
           insert into pizza (sabor, preco, quantidade)
           values
            ('${novaPizza.sabor}', ${novaPizza.preco}, ${novaPizza.quantidade})
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
                select max(codigo) from pizza 
                """,Int::class.java
        )
        return  ultimoCodigo
    }

    fun vender(codigo:Int):Boolean {
        val atualizados = jdbcTemplate.update("""
        update pizza set quantidade = quantidade -1
        where 
        codigo = $codigo
        and quantidade > 0
        """)

        return atualizados == 1
    }

    fun recuperar(codigo: Int):Pizza {
        val pizza = jdbcTemplate.queryForObject("""
            select * from pizza where codigo = $codigo
        """, BeanPropertyRowMapper(Pizza::class.java))

        return pizza
    }

    fun atualizarPreco(codigo: Int, novoPreco: Double):Boolean {
        val atualizados = jdbcTemplate.update("""
        update pizza set preco = $novoPreco
        where 
        codigo = $codigo
        and quantidade > 0
        """)

        return atualizados == 1
    }
}