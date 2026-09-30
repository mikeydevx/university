package leer_archivo_csv;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Leer_Archivo {


    public void leer_ArchivoCsv(Alumnos alumnos[]) {

        try {
            // Crear el objeto de tipo File con la ruta del archivo CSV 
            File archivoCSV = new File("C://Users//mavel//Downloads//archivo alumnos.csv");

            // Crear un objeto Scanner para leer el archivo
            Scanner lector = new Scanner(archivoCSV);

            // Leer línea por línea
            int cont = 0;
            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                // El renglón se Separa para ser leido hasta donde encuentre comas (CSV)
                String[] datos = linea.split(",");
//                System.out.println(datos[0] + " " + datos[1] + " " + datos[2]);

                int edad = Integer.parseInt(datos[2]);
                alumnos[cont] = new Alumnos(datos[0], datos[1], edad);
                cont++; // avanzamos posicion del arreglo
            }

            // Cerrar el lector
            lector.close();
            
            
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + e.getMessage());
        }

    }

    // ****************************************************************************
    // TEMA SOLO DE REFERENCIA, DEMOSTRACION DE LECTURA DE ARCHIVO LUEGO REESCRIBIR
    // ****************************************************************************
    public void escribirArchivo() {
        try {
            // OTRO METODO PARA LEER UN ARCHIVO
            //**********************************
            
            // Crear el objeto File con la ruta del archivo CSV
            File archivoCSV = new File("D://2024 SEP - DIC//Mi material Estructura de datos//archivo csv.csv");

            // Crear un objeto Scanner para leer el archivo actual
            Scanner lector = new Scanner(archivoCSV);

            // Variable para almacenar datos en un buffer temporal
            StringBuilder contenido = new StringBuilder();

            // Leer el contenido existente del archivo y se agrega al buffer
            while (lector.hasNextLine()) {
                contenido.append(lector.nextLine()).append("\n");
            }

            // Cerrar el lector al archivo original
            lector.close();

            //*****************************************************************
            // PROCESO PARA ESCRIBIR EN EL ARCHIVO
            
            // Abre el mismo archivo pero para REescribir
            PrintWriter escritor = new PrintWriter(archivoCSV);

            // Escribir nuevos datos en el archivo, se borró lo anterior
            escritor.println("nuevo,dato1,dato2");
            escritor.println("otro,dato3,dato4");

            // Escribir los datos antiguos, respaldados en el buffer
            escritor.print(contenido.toString());

            // Cerrar el escritor donde se escribió
            escritor.close();

            System.out.println("Datos añadidos al archivo correctamente.");

        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + e.getMessage());
        }

    }

}
