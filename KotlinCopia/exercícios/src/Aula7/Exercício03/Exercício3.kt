package Aula7.Exercício03

fun main(){
    var atleta1 = Atleta("Viviane", 5, 10)
    var atleta2 = Atleta("Marcus", 7, 15)

    var prova1Atleta1 = Prova(2, 2)
    var prova2Atleta1 = Prova(3, 4)
    var prova3Atleta1 = Prova(5, 17)

    println("Aptidão do atleta para a prova 1: ${prova1Atleta1.realizarProva(atleta1)}")
    println("Aptidão do atleta para a prova 1: ${prova2Atleta1.realizarProva(atleta1)}")
    println("Aptidão do atleta para a prova 1: ${prova3Atleta1.realizarProva(atleta1)}")

    var prova1Atleta2 = Prova(1, 1)
    var prova2Atleta2 = Prova(5, 5)
    var prova3Atleta2 = Prova(10, 17)

    println("Aptidão do atleta para a prova 2: ${prova1Atleta2.realizarProva(atleta1)}")
    println("Aptidão do atleta para a prova 2: ${prova2Atleta2.realizarProva(atleta1)}")
    println("Aptidão do atleta para a prova 2: ${prova3Atleta2.realizarProva(atleta1)}")

}