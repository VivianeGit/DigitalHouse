package Aula5.Decisão

fun main () {
    print("Digite uma letra: ")
var sexo = readLine()!!.toString()
    if(sexo == "M")
        println("Sexo masculino.")
    else if(sexo == "F")
        println("Sexo feminino. ")
    else
        println("Sexo inválido. ")
}