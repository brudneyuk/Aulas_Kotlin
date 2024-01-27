import org.apache.commons.dbcp2.BasicDataSource
import org.springframework.jdbc.core.BeanPropertyRowMapper
import org.springframework.jdbc.core.JdbcTemplate


/*
object -> indica que só existirá 1 e somente 1 objeto do tipo Conexao na execução projeto
A isso chamamos de SINGLETON
 */
object Conexao {

    // a "?" é para podermos atribuir null
    var jdbcTemplate:JdbcTemplate? = null
        get() {
            if (field == null){
                val dataSource = BasicDataSource()
                dataSource.driverClassName = "org.h2.Driver"
                dataSource.url = "jdbc:h2:mem:pizzaria"
                dataSource.username = "sa"
                dataSource.password = ""
                val novoJdbcTemplate = JdbcTemplate(dataSource)
                field = novoJdbcTemplate
            }
            return  field
        }

    fun criarTabelas() {
        jdbcTemplate!!.execute("""
            create table pizza (
            codigo INT GENERATED BY DEFAULT AS IDENTITY primary key,
            sabor varchar(30),
            preco double,
            quantidade int
            )
            
        """)
    }
}