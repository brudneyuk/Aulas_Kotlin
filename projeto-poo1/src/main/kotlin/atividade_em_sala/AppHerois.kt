package atividade_em_sala

fun main() {
    /*
    Aqui estamos CRIANDO
    um objeto do tipo atividade_em_sala.Heroi
    "faça-se um atividade_em_sala.Heroi! seu nome em memória será 'heroi1'"
     */

    val heroi1 = Heroi()

    println(heroi1.aposentado)

    heroi1.nome = "Goku"
    heroi1.poderes = "Voar, teletransportar, trasformar"
    heroi1.vida = 30.5

    println(heroi1.nome)
    println(heroi1.poderes)
    println(heroi1.vida)

    heroi1.usarPoder()

    val heroi2 = Heroi()
    println(heroi2.nome)
    println(heroi2.poderes)
    heroi2.usarPoder()

    println("O ${heroi1.nome} está aposentado? ${heroi1.aposentado}")

    heroi1.aposentar()

    println("O ${heroi1.nome} está aposentado? ${heroi1.aposentado}")

    println("Quannto de vida o ${heroi2.nome} tem? ${heroi2.vida}")
    heroi2.apanhar(5.0)
    println("Quannto de vida o ${heroi2.nome} tem? ${heroi2.vida}")
    heroi2.apanhar(15.0)
    println("Quannto de vida o ${heroi2.nome} tem? ${heroi2.vida}")
    heroi2.apanhar(33.0)
    println("Quanto de vida o ${heroi2.nome} tem? ${heroi2.vida}")

    heroi1.apanhar(90.0)
    println("Quanto de vida o ${heroi1.nome} tem? ${heroi1.vida}")
}