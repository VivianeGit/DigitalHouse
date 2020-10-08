package Aula7.Exercício02

fun main(){
    var jogador1 = JogadorDeFutebol("Viviane", 10, 5, 5, 8)
    var jogador2 = JogadorDeFutebol("Marcus", 15, 10, 6, 10)

    var treino = SessaoDeTreinamento(5)
    treino.treinarA(jogador1)
    treino.treinarA(jogador2)

}