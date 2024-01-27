import kotlin.math.pow

fun main() {
    println("É nóis no Kotlin!")
    println("Segunda linha loka")
    println()
    println("Onde estou?")
    println("\nE eu, \nonde estou?")
    println("\r\nEra uma vez \r\num lugarzinho no meio do nada")

    var bairro = "Bela Vista"
    // Variável String (texto)
    var populacao = 50000
    /*
    variável int (número inteiro)
     */
    var ligado = false
    // variável boolean (booleana)

    var altura = 1.88
    // variável double (número real)

    /*
    A interpolação (String template) deve ser feito entre aspas duplas
    podemos usar apenas $ ou ${}. porém apenas $ permite usar só o valor
    se usarmos ${} podemos invocar funç~pes e executar códigos.
      */

    println("No bairro ${bairro} moram ${populacao} pessoas")
    println("No bairro $bairro moram $populacao pessoas")

    println("\r\nNo bairro ${bairro.uppercase()} o IDH é ${(10+9)/3}")

    // operações matemáticas básicas

    val soma = 5 + 4
    val multi = 3 * 3
    val divisao = 90 / 2
    val subtracao = 8 - 3
    val potencia = Math.pow(2.0, 3.0)
    val potencia2 = 2.0.pow(3)
    println("potência 1: $potencia")
    println("potência 2: $potencia2")

    var endereco = "rua loka, 10"
    endereco = "rua dahora, 90"
    /*
    Variáveis criadas com "var" podem ter o valor alterado
    Mas as criadas com "val" NÃO podem ter o valor alterado NUNCA!
    OU seja, é uma variável IMUTÁVEL
     */
    val cpf = "1234567812"
    //cpf = "999999"

    var idade = 12
    /*
    As estruturas if; if-else e if-else-if
    funcionam como no javaScript
     */
    if (idade >= 18) { // todos os operadores de comparação numéricas são os mesmos de JS
        println("maior de idade")
    } else {
        println("vai jogar PS!")
    }

    var contador = 0
    /*
    O while funciona de maneira semelhante ao JS
     */
    while (contador < 4) {
        println("100 querer 20 amar")
        contador++
    }

    idade = 14
    when (idade) {
        in 0..6 -> println("bebê")
        in 7..10 -> { // para executar +1 linha, abra chaves
            println("criançinha")
            println("não deixa ela morrer")
        }
        14 -> {
            println("adolescente")
            println("ensine sobre DSTs!")
        }
        22 -> println("adulto")
        65 -> println("melhor idade")
        in 130..Int.MAX_VALUE -> println("Matusalém")
        else -> println("idade inválida!")
    }

    var salario = 2500
    var classeSocial = when (salario) {
        in 0..500 -> "D"
        in 501..1500 -> "C"
        in 1501..5000 -> "B"
        in 5001..50000 -> "A"
        else -> "Inválida" //else é obrigatório p/ when com atribuição
    }
    println(classeSocial)
}