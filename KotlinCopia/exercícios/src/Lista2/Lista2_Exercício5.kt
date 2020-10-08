package Lista2

fun main() {
    println("Digite o primeiro número:")
    val numA = readLine()!!.toInt()
    println("Digite o segundo número:")
    val numB = readLine()!!.toInt()
    println("Digite o terceiro número:")
    val numC = readLine()!!.toInt()
    println("Digite o quarto número:")
    val numD = readLine()!!.toInt()

    println(maiorNumero(numA, numB, numC, numD))
}

fun maiorNumero(a: Int, b: Int, c: Int, d: Int) : Boolean{return (a > c && a > d) || (b > c && b > d) }