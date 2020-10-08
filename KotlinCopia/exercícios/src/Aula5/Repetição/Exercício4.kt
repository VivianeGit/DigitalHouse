package Aula5.Repetição

fun main() {
    println("Insira um nome: ")
    var nome = readLine()!!.toString()
    if (nome.length > 3) {
        println("O nome ~ $nome ~ é válido")
    } else
        println("O nome ~ $nome ~ precisa ter mais de 3 caracteres")
    println("Insira sua idade: ")
    var idade = readLine()!!.toInt()
    if (idade > 0 && idade < 50) {
        println("A idade ~ $idade ~ é válida")
    } else
        println("A idade ~ $idade ~ é inválida")
    println("Informe seu salário: ")
    var salario = readLine()!!.toDouble()
    if(salario > 0) {
        println("O valor do seu salário é: $salario. Está positivo!")
    }else
        println("O valor do seu salário é: $salario. Está negativo")
    println("Informe seu sexo: ")
    val sexo = readLine()!!.toString()
    if(sexo == "f" || sexo == "m") {
        println("O sexo que foi informado é válido")
    }else
        println("O sexo informado é inválido")
    println("Informe seu estado civel: ")
    var estadoCivil = readLine()!!.toString()
    when(estadoCivil){
        "s" -> println("O estado civil é solteiro.")
        "c" -> println("O estado civil é casado. ")
        "v" -> println("O estado civil é viuvo. ")
        "d" -> println("O estado civil é divorciado. ")
        else -> println("O estado civil não foi identificado.")

    }

    }






