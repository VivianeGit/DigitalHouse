package Aula8_9.Exercício

class ContaCorrente(conta: Int, saldo: Double, val taxaDeOperacao: Double): ContaBancaria(conta, saldo) {
    override fun sacar(valor: Double): Boolean {
        saldo -= valor + taxaDeOperacao
        if (valor > (saldo + taxaDeOperacao)) {
            println("Saldo insuficiente.")
            return true
        } else {
            println("Saque efetuado!")
            return false
        }
    }
        override fun depositar(valor: Double): Boolean {
            if (saldo + valor >= taxaDeOperacao) {
                saldo += valor - taxaDeOperacao
                return true
            }else
                return false
        }
        override fun mostrarDados() {
            super.mostrarDados()
            println("Taxa: $taxaDeOperacao")
        }
    }


