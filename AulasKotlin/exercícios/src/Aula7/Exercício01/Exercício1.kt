package Aula7.Exercício01

fun main() {
    var cliente1 = Cliente("Viviane", "Cipriano")
    var cliente2 = Cliente("Marcus", "Medeiros")

    val conta1 = Conta(159, 35, cliente1)
    val conta2 = Conta(753, 70, cliente2)

    conta1.depositar(200)
    conta1.sacar(30)

    conta2.depositar(100)
    conta2.sacar(20)


}