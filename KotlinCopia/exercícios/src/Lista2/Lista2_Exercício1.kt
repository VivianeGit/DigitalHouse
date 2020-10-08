package Lista2

fun main() {

    println("Digite o primeiro número:")
    val num1 = readLine()!!.toInt()
    println("Digite o segundo número:")
    val num2 = readLine()!!.toInt()
    println("Digite o terceiro número:")
    val num3 = readLine()!!.toInt()
    var maiorNumero: Int
    if (num1 > num2) {
        maiorNumero = num1
    }else maiorNumero = num2

    if (maiorNumero < num3) maiorNumero = num3
    println("O maior número é $maiorNumero")


}

