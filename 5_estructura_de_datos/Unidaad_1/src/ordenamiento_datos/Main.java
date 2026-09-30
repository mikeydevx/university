/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamiento_datos;

/**
 *
 * @author mavel
 */
public class Main {
    public static void main(String[] args) {
        Alumnos alumnos[] = new Alumnos[10]; //Arreglo de tipo Alumnos
        
        //Llamamos al método para leer, enviamos el objeto arreglo 
        Leer_Archivo.leer_ArchivoCvs(alumnos);
        
        // revisamos un dato
        for (int i = 0; i < 10; i++) {
            System.out.println(alumnos[i].getMatricula() + " " + 
                    alumnos[i].getNombre() + " " + alumnos[i].getEdad());
            
        
        }
        
        
    }
}
