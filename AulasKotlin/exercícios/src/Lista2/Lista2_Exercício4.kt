package Lista2

fun main() {
//    var num = 0
//    var count = 0
//    do {
//        if (num % 2 != 0) {
//            count++
//            println(num)
//        }
//        num++
//    } while(count < 100)
//    println("Foram impressos $count números.")

    //Outra forma de fazer

    var count = 0
    for (num in 1..200) {
        if (num % 2 != 0) {
            count++
            println(num)
        }
    }
    println("Foram impressos $count números.")
}






