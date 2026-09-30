// Definicion de clase
class Persona{
    var name: String = ""
    var age: Int = 0
}

//Constructor de clase
class Human(var name: String){
}

fun main(){
   //Ejemplo de instancia de objeto
    var persona = Persona()
    persona.name="Miguel";
    println("Tu nombre es ${persona.name}")

    var human= Human("Miguel")
    println("Tu nombre es ${human.name}")
}