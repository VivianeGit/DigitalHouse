package Aula12.Exercicio1

fun main() {
    var pessoa1 = Pessoa("José", Estado("PB", "Paraíba"))
    var pessoa2 = Pessoa("Paulo", Estado("SP", "São Paulo"))
    var pessoa3 = Pessoa("Renato", Estado("MG", "MInas Gerais"))
    var pessoa4 = Pessoa("Leandro", Estado("RJ", "Rio de Janeiro"))

    val pessoas = listOf(pessoa1, pessoa2, pessoa3, pessoa4)

    val pessoasAgrupadas = mutableMapOf<String, ArrayList<Pessoa>>()

    println(pessoas.groupBy { it.estado.sigla })
}