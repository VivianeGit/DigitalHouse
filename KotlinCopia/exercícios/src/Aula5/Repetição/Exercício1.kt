package Aula5.Repetição
fun main(){

    var maiorNumero = 0
    for(i in 1..5){
        print("Informe o ${i}º valor:")
        val num = readLine()!!.toInt()
        if(num > maiorNumero ){
            maiorNumero = num
        }
    }
    println("O maior número é $maiorNumero")
}