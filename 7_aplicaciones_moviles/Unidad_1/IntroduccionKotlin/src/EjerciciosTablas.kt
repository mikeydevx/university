//Desarrollar un programa que solicitie al usuario un numero
// y muestre la tabla de multiplicar del numero del ingresado
// y muestre la cantidad de resultados pares y resultados inpares
fun main(){
var numero: Int = 0
var contadorPares = 0
var contadorImpares =0

    print("Ingresa el número de la tabla: ")
    numero = readln().toIntOrNull() ?: 0

    for(i in 1..10){
        println("$numero * $i =   ${numero*i}")
        if ((numero*i)%2==0){
            contadorPares = contadorPares + 1
        }else{
            contadorImpares = contadorImpares + 1
        }
    }

    println("Numeros pares: $contadorPares")
    println("Numeros impares: $contadorImpares")

}