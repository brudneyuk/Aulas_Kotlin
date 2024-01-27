class Estado {

    var nome:String = ""
        get() {
            return if (field.isBlank()) "(Não informado)"
                else field
        }
    var uf:String = ""
        get() {
            return if (field.isBlank()) "(Não informado)"
            else field.uppercase()
        }

    var populacao:Int = 0
        set(value) {
            if (value >=0) {
                field = value
            }
        }

}