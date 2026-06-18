
package Ejercicio_5_Alumno;

public class PruebaAlumno {

    public static void main(String[] args) {
        Alumno [] datos = new Alumno[3]; //arreglo en java, almacenara 3 objetos
        
        datos[0]=new Alumno ("1001\t", "Miguel\t", "LDSM303\t", "Software\t"); 
        datos[1] = new Alumno("1002\t", "Angel\t", "LDSM303\t", "Software\t");
        datos[2] = new Alumno("1003\t", "Juan\t", "LDSM302\t", "Entornos\t");
        
        for (int i = 0; i <= 2; i++) {
            System.out.println(datos[i].mostrarDatos());
        }
   
    }
    
}
