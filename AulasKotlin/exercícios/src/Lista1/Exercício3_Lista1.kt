fun main(){
    println("Digite sua altura: ")
    val h = readLine()!!.toDouble()
    println("Para homens ${(72.7 * h) - 58}!")
    println("Para mulheres ${(62.1 * h) - 44.7}!")
}