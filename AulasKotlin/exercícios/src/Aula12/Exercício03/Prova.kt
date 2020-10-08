package Aula12.Exercício03

class Prova {
    fun somaTotal(conjuntoDeInteiros: MutableSet<Int>){
        var soma = 0
        conjuntoDeInteiros.forEach{soma += it}
        println(soma)
    }
}