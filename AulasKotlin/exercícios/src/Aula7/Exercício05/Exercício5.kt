package Aula7.Exercício05
fun main(){
    val carro = Veiculo("Jeep", "Renegade", 2020, "Vermelho", 0)
    val cliente = Cliente("Viviane", "Cipriano", 8399634-5944)
    val venda = Venda(cliente, carro, 80000)
    val concessionaria: Concessionaria = Concessionaria()
    concessionaria.registrarVenda(venda)

}