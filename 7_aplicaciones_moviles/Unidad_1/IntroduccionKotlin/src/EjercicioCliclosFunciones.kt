fun main(){


    var opcion: Int = 0

    do {
        println("Ingresa la opción: ")
        println("1. Tablas de multiplicar")
        println("2. Factorial de un número")
        println("3. Números pares")
        println("4. Salir")
        print("Ingresa la opción: ")
        opcion = readln().toInt()

        when(opcion){
            1 ->
                tablasMultiplicar()
            2 ->
                factorialNumero()
            3 ->
                numerosPares()
            0 ->{}
            else -> println("Opcion inválidad")
        }

    }while(opcion !=0)
}

fun tablasMultiplicar(){
    var tabla = 0
    print("Ingresa que tabla quieres usar: ")
    tabla=readln().toInt()
    for (i in 1..10){
        println("$tabla * $i = ${tabla*i}")
    }
}

fun factorialNumero(){
    var numero = 0
    var factorial = 1
    print("Ingresa el número: ")
    numero = readln().toInt()

    for (i in 1..numero){
        factorial *= i
    }
    println(factorial)
}

fun numerosPares(){
    var numero = 0
    print("Ingresa el numero: ")
    numero = readln().toInt()

    for (i in 1..numero){
        if(i%2==0){
            println(i)
        }
    }
}