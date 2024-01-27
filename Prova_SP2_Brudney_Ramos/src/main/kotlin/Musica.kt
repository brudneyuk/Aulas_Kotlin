import java.time.LocalDate
import javax.sql.DataSource
import java.time.LocalDateTime

class Musica {
    var id:Int = 0
    var titulo:String = ""
    var artista:String = ""
    var dataCriacao: LocalDate = LocalDate.now()
}