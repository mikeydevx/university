fun main(){
    val numero: Int

    println("Ingresa el numero: ")
    numero = readln().toInt();

    for (i in 1..10){
        println("$numero * $i = ${numero*i}")
    }

}