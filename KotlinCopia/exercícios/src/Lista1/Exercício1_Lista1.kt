fun main() {
    println("Informe a primeira nota: ")
    val num1 = readLine()!!.toDouble()
    println("Informe a segunda nota: ")
    val num2= readLine()!!.toDouble()
    println("Informe a terceira nota: ")
    val num3 = readLine()!!.toDouble()
    println("Informe a quarta nota: ")
    val num4 = readLine()!!.toDouble()
    var media = (num1 + num2 + num3 + num4)/4
    println("Sua media é: $media")


}


