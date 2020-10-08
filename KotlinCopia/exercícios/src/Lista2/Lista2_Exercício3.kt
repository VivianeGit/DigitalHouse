package Lista2

fun main(){
    println("Digite um número:")
    val num = readLine()!!.toInt()

    println(numero(num))
}

fun numero(a: Int): Boolean { return (a % 2 == 0) }