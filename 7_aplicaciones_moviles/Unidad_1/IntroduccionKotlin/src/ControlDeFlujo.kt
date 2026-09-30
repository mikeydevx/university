fun main(){
    //Ejemplo de IF

    val x = 10
    val y = 20

    if (x>y) {
        println("X es mayor que Y")
    }else{
        println("Y es mayor que x")
    }

    //Ejemplo de IF como expresión
    val result = if(x>y) "$x > $y  " else "$y > $x"
    println(result)

}