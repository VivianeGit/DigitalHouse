package Aula8_9.Exercício

abstract class ContaBancaria(protected val conta: Int, protected var saldo: Double): Iimprimivel {
    abstract fun sacar(valor: Double): Boolean
    abstract fun depositar(valor: Double): Boolean
    override fun mostrarDados() {
        println("Conta: $conta")
        println("Saldo: $saldo")
        fun transferir(contaDestino: ContaBancaria, valorTransferencia: Double) {
            if (sacar(valorTransferencia) && contaDestino.depositar(valorTransferencia)) {
                if (!sacar(valorTransferencia)) {
                    println("A tranferência foi realizada!")
                } else
                    println("Saldo insuficiente para transferencia")
            }
        }
    }
}