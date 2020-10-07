fun main() {
        println("Quanto você ganha por hora? ")
        val valor = readLine()!!.toInt()
        println("Quantas horas você trabalhou esse mês? ")
        val hora = readLine()!!.toInt()
        val total = (valor * hora)
        println("você recebeu esse mês $total reais")
}