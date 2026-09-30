fun main(){
    val valor = 10

    //Ejemplo de when equvalente a switch
    //Pero Klotin no tiene Switch

    when(valor){
        15 -> println("Numero 15")
        12 -> println("Numero 12")
        13 -> println("Numero 13")
        10 -> println("Numero 10")
        else -> println("No es valido")
    }


    for (i in 1..5){
        println(i)
    }

    
    for (i in 1 until 10){
        println(i)
    }
}
