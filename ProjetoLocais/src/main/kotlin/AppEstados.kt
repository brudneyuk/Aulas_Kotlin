fun main() {
    val estado1 = Estado()
    estado1.nome = "São Paulo"
    estado1.uf = "sp"

    println("A sigla de ${estado1.nome} é ${estado1.uf}")
    println("A sigla de ${estado1.nome} é ${estado1.uf}")
    println("A sigla de ${estado1.nome} é ${estado1.uf}")

    val estado2 = Estado()
    estado2.nome = ""
    estado2.uf = ""
    println("A sigla de ${estado2.nome} é ${estado2.uf}")

    estado1.populacao = 900
    estado2.populacao = -300

    println("Habitantes dos estado1: ${estado1.populacao}")
    println("Habitantes dos estado2: ${estado2.populacao}")


}