package Aula5.Decisão
fun main(){

print("Qual a primeira nota? ")
var nota1 = readLine()!!.toInt()
print("Qual a segunda nota? ")
var nota2 = readLine()!!.toInt()
var media = (nota1 + nota2)/2
if(media >= 7)
println("Parabéns, você foi aprovado! ")
else if (media < 7)
println("Você foi reprovado. Se esforce mais! ")
else if (media == 10)
println("Aprovado com distinção! ")

}