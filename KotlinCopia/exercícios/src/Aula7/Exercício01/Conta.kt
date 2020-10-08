package Aula7.Exercício01


class Conta(numeroDaConta: Int, var saldo: Int, titular: Cliente) {
    fun depositar(quantiaDinheiro: Int) {
        saldo = saldo + quantiaDinheiro
        println("Foi realizado um depósito, seu novo saldo é: $saldo")

    }
    fun sacar(quantiaDinheiro: Int){
        if(quantiaDinheiro > saldo){
            println("Saldo insuficiente")
        } else
            saldo = saldo - quantiaDinheiro
            println("Saque realizado! Esse é o novo saldo: $saldo")

    }
    }
