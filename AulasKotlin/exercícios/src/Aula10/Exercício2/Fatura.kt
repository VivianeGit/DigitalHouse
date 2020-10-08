package Aula10.Exercício2

class Fatura() {
    val itens get() = ArrayList<Itens>()
    fun GetTotalFatura(){
        var valorTotal:Double = 0.0
        for(item in itens){
            valorTotal = (item.quantidade * item.preco)

        }

    }
}