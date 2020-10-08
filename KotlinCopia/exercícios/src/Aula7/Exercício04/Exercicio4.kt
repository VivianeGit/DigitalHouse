package Aula7.Exercício04

fun main(){
    var fiat = Carro(6)
    fiat.adicionarGasolina(70)
    fiat.andar(2)
    println("Resta ${fiat.obterGasolina()} litros de gasolina.")

}