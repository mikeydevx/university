/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamiento_datos;

import java.io.File; //Entrada y salida especificar que archivo queremos abrir.
import java.util.Scanner;//Para poder leer el archivo.
import java.io.FileNotFoundException; //Para capturar el error.
import java.io.PrintWriter;//Para escribir los datos en el archivo

public class Leer_Archivo {
    
    public static void leer_ArchivoCvs(Alumnos alumnos[]){
      
        try {
            //Crear el objeto de tipo File con la ruta del archivo CSV
            File archivoCSV = new File("C://Users//mavel//Downloads//archivo alumnos.csv");
            
            //Crear un objeto Sccaner para leer el archivo
            Scanner lector = new Scanner(archivoCSV, "UTF-8");
            
            // Leer línea por línea
            int cont = 0;
            while (lector.hasNextLine()) {
               String linea = lector.nextLine();
               //El renglón se Separa para ser leido
               String[] datos = linea.split(",");
               
               int edad = Integer.parseInt(datos[2]);
               alumnos[cont] = new Alumnos(datos[0], datos[1], edad);
               cont++;
            }
            
            //cerrar el lector
            lector.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("Error en  archivo: " + e.getMessage());
        }
        
    }
}
