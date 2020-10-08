package Aula12.Exercicio01

fun main(){
    var loteriaDosSonhos = mapOf(0 to "Ovos", 1 to "Agua", 2 to "escopeta", 3 to "Cavalo", 4 to "Destista", 5 to "Fogo")
    var apelidos = mapOf("Joao" to listOf<String>("Juan", "Miguel", "Maromba")
            , "Miguel" to listOf("Nigth Watch", "Bruce Wayne", "Tampinha"), "Maria" to listOf("Wonder Woman", "Mary", "Marilene")
                 ,"Lucas" to listOf("Lukinha", "Jorge", "George"))
    println("Loteria:")
    loteriaDosSonhos.forEach{
        println("Números ${it.key} e significados ${it.value}")
    }
    println("Apelidos:")
    apelidos.forEach{
        println("Nomes ${it.key} e apelidos ${it.value}")
    }
}