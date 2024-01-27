class Cidade {
    /*
    Encapsule o 'nome' de tal forma que:
    1. só aceita valores entre 3 e 20 caracteres (dica, use o .length)
    2. sempre que for solicitado seu valor:
        - caso não esteja vazio. retorne o valor em caixa alto
        - caso contrário, retorne "(não informado)"
     */
    var nome:String = ""
        set(value) {
            if (value.length >= 3 && value.length <= 20){
                field = value
            }
        }
        get() {
            if (field.isNotBlank()) {
                return field.uppercase()
            } else {
                return "(Não informado)"
            }
        }
}