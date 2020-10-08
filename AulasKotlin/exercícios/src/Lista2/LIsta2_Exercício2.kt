package Lista2

fun main(){
    println("Digite um texto:")
    val texto1 = readLine()!!
    println("Digite um texto:")
    val texto2 = readLine()!!
    println(comparaTexto(texto1, texto2))

}

fun comparaTexto(a: String, b: String): Boolean { return a != b}