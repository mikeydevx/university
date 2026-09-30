package leer_archivo_csv;

/**
 * Programa que muestra como se lee datos de un archivo de tipo CSV, de datos de
 * alumnos a un arreglo de tipo clase de alumnos
 *
 * @author Roberto Castillo Ortega
 */
public class Main_Leer_Archivo_arreglo_objetos {

    public static void main(String[] args) {
        Alumnos alumnos[] = new Alumnos[10];
        Leer_Archivo leer = new Leer_Archivo();

        // llamamos al método para leer, enviamos el objeto arreglo de Alumnos
        leer.leer_ArchivoCsv(alumnos);

        new Alumnos_vista(alumnos).setVisible(true);

    }

}
