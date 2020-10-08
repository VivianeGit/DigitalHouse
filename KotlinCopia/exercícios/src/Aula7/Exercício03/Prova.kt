package Aula7.Exercício03

class Prova(var dificuldade: Int, var energiaNecessaria: Int ) {
    fun realizarProva(atleta: Atleta) = (atleta.nivel >= dificuldade && atleta.energia >= energiaNecessaria)



    }
