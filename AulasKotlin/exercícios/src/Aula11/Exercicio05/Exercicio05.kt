package Aula11.Exercicio05

fun main() {
    try {
        val nomes = ArrayList<String>()
        nomes.add("Pato")
        nomes.add("Cachorro")
        nomes.add("Gato")
        println(nomes[3])
    } catch (ex: Exception){
        println(ex.message)
    }
}
