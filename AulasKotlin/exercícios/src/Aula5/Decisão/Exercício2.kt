package Aula5.Decisão
fun main (){
print("Digite um número inteiro: ")
var num = readLine()!!.toInt()
if( num % 2 == 0)
println("Esse número é par! ")
else
println("Esse número é ímpar! ")
}