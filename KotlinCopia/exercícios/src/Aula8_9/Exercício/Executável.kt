package Aula8_9.Exercício
fun main() {
    var conta1 = ContaCorrente(555, 100.50, 2.5)
    var conta2 = ContaPoupanca(666, 150.20, 20.5)
    conta1.depositar(5.0)
    conta2.depositar(1.00)
    var saque1 = conta1.sacar(50.5)
    var saque2 = conta2.sacar(290.5)
    var relatorio = Relatorio()
    relatorio.gerarRelatorio(conta2)
    conta1.depositar(5.0)
    conta2.depositar(1.00)


}