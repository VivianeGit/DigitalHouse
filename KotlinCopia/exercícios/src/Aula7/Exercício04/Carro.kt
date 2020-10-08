package Aula7.Exercício04

class Carro(var consumo: Int) {
    var nivelTanque: Double = 0.0
    fun andar(km: Int){
        nivelTanque -= (consumo * km)
    }
    fun obterGasolina(): Double {
        return(nivelTanque)
    }
    fun adicionarGasolina(combustivel: Int){
        nivelTanque += combustivel
    }
}