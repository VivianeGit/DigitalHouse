package Aula10.Exercício2

class Itens(val numItem: Int, val descricao: String, var quantidade: Double, var preco: Double) {
    init{
        if(quantidade < 0)
            quantidade = 0.0
        if(preco < 0)
            preco = 0.0
    }
}