package Aula11.Exercicio04

fun main(){
    var lista = ArrayList<Funcionario>()
    lista.add(Funcionario("José", 55))
    lista.add(Funcionario("Pedro", 66))
    lista.add(Funcionario("Lucas", 77))
    lista.add(Funcionario("Francisco", 88))
    println(lista.contains(Funcionario("Jorge", 55)))
}