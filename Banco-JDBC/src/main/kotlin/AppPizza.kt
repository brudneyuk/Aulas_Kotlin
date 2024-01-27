import javax.swing.JOptionPane

fun main() {

    //Criamos um objeto do tipo Conexao e invocamos seu método criarTabelas()
    Conexao.criarTabelas()

    val repositorio = PizzaRepositorio()
    repositorio.iniciar()

    while (true) {
        val cadastrar = JOptionPane.showInputDialog("Quer cadastrar uma nova pizza? S para sim ou qualquer coisa para não")

        if (cadastrar.uppercase() != "S"){
            break //sai do while
        }

        val novaPizza = Pizza()
        novaPizza.sabor = JOptionPane.showInputDialog("Qual sabor?")
        novaPizza.preco = JOptionPane.showInputDialog("Qual preço?").toDouble()
        novaPizza.quantidade = JOptionPane.showInputDialog("Qual quantidade?").toInt()



        repositorio.cadastrar(novaPizza)
    }

    var ultimo = repositorio.getUltimoCodigo()
    var codigo = JOptionPane.showInputDialog("Qual pizza quer vender? Digite de 1 a $ultimo").toInt()

    if (codigo >= 1 && codigo <= ultimo){
        val vendeu = repositorio.vender(codigo)
        val pizza = repositorio.recuperar(codigo)
        if (vendeu) {
            JOptionPane.showMessageDialog(null, "Quantidade da pizza de ${pizza.sabor} atualizada para ${pizza.quantidade}")
        } else {
            JOptionPane.showMessageDialog(null, "A pizza de ${pizza.sabor} está zerada no estoque")
        }
    }
    ultimo = repositorio.getUltimoCodigo()
    codigo = JOptionPane.showInputDialog("Qual pizza quer mudar de preço? Digite de 1 a $ultimo").toInt()

    val novoPreco = JOptionPane.showInputDialog("Qual o novo preço?").toDouble()

    val atualizou = repositorio.atualizarPreco(codigo, novoPreco)
    val pizzaComNovoPreco = repositorio.recuperar(codigo)

    val mensagem = if(atualizou)
        "Preço da pizza ${pizzaComNovoPreco.sabor} atualizado para R$${novoPreco}"
                        else "Pizza não encontrada"
    JOptionPane.showMessageDialog(null, mensagem)
}