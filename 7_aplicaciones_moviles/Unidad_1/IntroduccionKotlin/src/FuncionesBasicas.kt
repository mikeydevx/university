// Ejemplo de una función básica en Kotlin
fun saludar() {
    println("Hola desde Kotlin")
}

// Función que recibe parámetros
fun saludoPersonalizado(nombre: String) {
    println("Hola, $nombre, buen día")
}

// Función que suma dos números
fun sumaNumeros(a: Int, b: Int): Int {
    return a + b
}

// Función con retorno simplificado
fun multiplicar(a: Int, b: Int): Int = a * b

// Ejemplo de arreglos
fun arreglos() {
    val frutas = arrayOf("manzana", "pera", "sandía")

    for (fruta in frutas) {
        println(fruta)
    }
}

fun main() {
    saludar()
    saludoPersonalizado(nombre = "Miguel")

    println(sumaNumeros(a = 4, b = 5))
    println(multiplicar(a = 4, b = 2))

    arreglos()
}