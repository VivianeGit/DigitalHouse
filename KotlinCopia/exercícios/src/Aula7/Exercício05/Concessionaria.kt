package Aula7.Exercício05

class Concessionaria {
    fun registrarVenda(venda: Venda){
        println("A Venda do veiculo ${venda.veiculo.marca} foi finalizada para ${venda.cliente.nome}," +
                " no valor RS ${venda.valorVenda} ." )
    }

}