fun main() {

    val herois = listOf("Batman", "Mulher Maravilha", "Thor")
    /*
    listOf()
    Cria uma lista IMUTÁVEL (ou somente leitura), nenhum elemento pode entrar ou sair dela
    */
    print(herois)

    println("\n\rPrimeiro: ${herois[0]}")
    println("\n\rTerceiro: ${herois[2]}")
    println("Último: ${herois[herois.size-1]}")

    println("\n\rPrimeiro: ${herois.first()}")
    println("\n\rÚltimo: ${herois.last()}")

    //herois.add("Saitama")

    /*
    mutableListOf()
    Cria uma lista MUTÁVEL
    ou seja, é possivel adicionar ou aumentar a lista
     */

    val paises = mutableListOf("Brasil", "México", "Chile")

    paises.add("Cuba") // insere um elemento

    println(paises)

    paises.remove("México") //remove pelo VALOR
    paises.removeAt(0) // remove pela posição (índice)
    println(paises)

    paises.addAll(listOf("Panamá","Argentina", "Panamá"))
    println(paises)
    // as listas PERMITEM elementos repetidos

    //caso existam repetições,
    //apenas o primeiro é excluido
    paises.remove("Panamá")
    println(paises)

    paises.add(2, "Brasil")
    println(paises)

    //alterando o valor em uma determinado posição
    paises.set(3, "EUA")
    //paises[3] = "EUA"
    println(paises)

    //isEmpty -> true se NÃO houvel nada na lista
    // isNotEmpty -> true se a lista tiver pelo menos 1 item
    println("Os países estão vazios? ${paises.isEmpty()}")
    println("Há países? ${paises.isNotEmpty()}")

    paises.sort()
    println(paises)

    // -> Ordena em ordem CRESCENTE
    val numeros = mutableListOf(22, 80, 9, 1, 20, -12)
    numeros.sort()
    println(numeros)

    // -> Ele INVERTE a lista
    // o primeiro vira o último
    numeros.reverse()
    println(numeros)

    // -> Ordena em ordem DECRESCENTE
    val bla = mutableListOf(2,8,1,9)
    bla.sortDescending()
    println(bla)

    /*
     -> Cria e devolve uma CÓPIA
     da lista original ordenada
     Mas NÃO altera em nada a lista original
     */
    val bichos = listOf("gato", "cachorro", "rato")
    println(bichos.sorted())
    val bichosOrdenados = bichos.sorted()
    println(bichos)
    println(bichosOrdenados)


    paises.forEach{
        println("Já fui no país $it")
    }

    paises.forEach { pais ->
        if (pais != "Brasil") {
            println("Eu não fui no país $pais")
        } else {
            println("Eu ja fui para o $pais")
        }
    }

    paises.forEachIndexed { indice, pais ->
        println("O país na posição $indice é $pais")
    }

    val paisesFiltrados = paises.filter {it.contains("m")}
    // -> val paisesFiltrados = paises.filter {it.startsWith("m")} VALIDA SE O NOME COMEÇA COM TAL LETRA

    println(paisesFiltrados)
    println(paises)

    /*
    Criem uma lista que contenha todos os pais comenos de 6 letras no nome.

    .length -> retorna o núm de letras de um texto
     */

    val listapais = mutableListOf("Brasil", "Cuba", "Argentina", "EUA")

    val paisesFiltrados2 = paises.filter {it.length < 6}
    println(paisesFiltrados2)

}
