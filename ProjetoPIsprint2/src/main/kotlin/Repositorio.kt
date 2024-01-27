import org.springframework.jdbc.core.BeanPropertyRowMapper
import org.springframework.jdbc.core.JdbcTemplate

class repository {

    lateinit var jdbcTemplate: JdbcTemplate

    fun iniciar() {
        jdbcTemplate = Conexao().conectar()
    }

    fun RegistroREDEUPLOAD(novoComponente: LoocaAPI) {
        jdbcTemplate.update("""
        insert into RegistrosTRUSTED (dadosCapturados, dataHora, fkComponente, fkIpservidor)
        values
        (${novoComponente.redeUpload}, '${novoComponente.dataHora}', 4, '${novoComponente.ip}')
        """)
    }

    fun RegistroREDEUPLOADRAW(novoComponente: LoocaAPI) {
        jdbcTemplate.update("""
        insert into RegistrosRAW (dadosCapturados, dataHora, fkComponente, fkIpservidor)
        values
        (${novoComponente.redeUploadRAW}, '${novoComponente.dataHora}', 4, '${novoComponente.ip}')
        """)
    }

    fun RegistroREDEDOWNLOAD(novoComponente: LoocaAPI) {
        jdbcTemplate.update("""
        insert into RegistrosTRUSTED (dadosCapturados, dataHora, fkComponente, fkIpservidor)
        values
        (${novoComponente.redeDownload}, '${novoComponente.dataHora}', 5, '${novoComponente.ip}')
        """)
    }

    fun RegistroREDEDOWNLOADRAW(novoComponente: LoocaAPI) {
        jdbcTemplate.update("""
        insert into RegistrosRAW (dadosCapturados, dataHora, fkComponente, fkIpservidor)
        values
        (${novoComponente.redeDownloadRAW}, '${novoComponente.dataHora}', 5, '${novoComponente.ip}')
        """)
    }

}