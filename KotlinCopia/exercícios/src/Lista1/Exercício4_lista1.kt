fun main(){
    println("Digite o peso dos peixes: ")
    val pesoDosPeixes = readLine()!!.toInt()
    val multa = 4
    val excesso = pesoDosPeixes > 50
    println("O peso do peixe excedeu ${pesoDosPeixes - 50} quilo(s)!")
    println("VocÊ pagará uma multa de ${(pesoDosPeixes - 50) * multa} reais.")
}