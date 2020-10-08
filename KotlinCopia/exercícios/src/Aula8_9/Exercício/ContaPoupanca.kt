package Aula8_9.Exercício

class ContaPoupanca(conta: Int, saldo: Double, private var limiteDeCredito: Double): ContaBancaria(conta, saldo) {
    override fun sacar(valor: Double): Boolean {
        if (valor > (saldo + limiteDeCredito)) {
            println("Saldo insuficiente.")
            return true
        }else
            saldo -= valor
        return false
    }
    override fun depositar(valor: Double): Boolean {
        saldo += valor
        return true
    }
       override fun mostrarDados() {
        super.mostrarDados()
        println("Limite: $limiteDeCredito")
    }
}