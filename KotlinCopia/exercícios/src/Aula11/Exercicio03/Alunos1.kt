package Aula11.Exercicio03

fun main(){
    val lista = ArrayList<Aluno>()
    lista.add( Aluno("José", 1545))
    lista.add(Aluno("lucas", 1542))
    lista.add(Aluno("Pedro", 1541))
    lista.add(Aluno("Jorge", 1543))
    val alunoNovo = Aluno("Francisco", 1548)
    println(lista.contains(alunoNovo))

}