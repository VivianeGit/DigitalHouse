package Aula7.Exercício02

class SessaoDeTreinamento (var experiencia : Int) {
    fun treinarA(jogadorDeFutebol: JogadorDeFutebol) {
        jogadorDeFutebol.correr()
        jogadorDeFutebol.fazerGol()
        jogadorDeFutebol.correr()
        val expAnterior = jogadorDeFutebol.experiencia
        jogadorDeFutebol.experiencia = jogadorDeFutebol.experiencia + experiencia
        println("A experiência anterior do jogagor é: $expAnterior. A experiencia nova é: ${jogadorDeFutebol.experiencia}")
    }
}