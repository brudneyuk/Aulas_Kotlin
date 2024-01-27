class Produto {
    var nome: String = ""
        get() {
            return if (field.isBlank() || field.length < 4) "N/D" else field
        }

    var brinde: Boolean = false
        set(value) {

        }

    var preco: Double = 0.0
        set(value) {
            if (value >= 0.01) {
                field = value
            }
            if (brinde){
                preco = 0.01
            }
        }
}