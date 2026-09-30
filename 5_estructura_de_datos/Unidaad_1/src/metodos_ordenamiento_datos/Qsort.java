/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos_ordenamiento_datos;

/**
 *
 * @author mavel
 */
public class Qsort {

    public static void quickSort(int[] numeros, int inicio, int fin) {
        if (inicio < fin) {
            int posicionPivote = particion(numeros, inicio, fin);

            //ordenada la parte izquierda
            quickSort(numeros, inicio, posicionPivote - 1);

            //ordena la parte derecha
            quickSort(numeros, posicionPivote + 1, fin);
        }
    }

    public static int particion(int[] numeros, int inicio, int fin) {
        int pivote = numeros[fin];
        int i = inicio - 1;

        for (int j = inicio; j < fin; j++) {
            if (numeros[j] <= pivote) {
                i++;
                int temporal = numeros[i];
                numeros[i] = numeros[j];
                numeros[j] = temporal;
            }
        }

        int temporal = numeros[i + 1];
        numeros[i + 1] = numeros[fin];
        numeros[fin] = temporal;

        return i + 1;
    }

    public static void main(String[] args) {

        int[] numeros = {2, 30, 72, 30, 3, 1, 10, 200};

        

        System.out.println("Original");
        for (int original: numeros) {
            System.out.print(original + " "); 
        }
        
        System.out.println("");
        
        quickSort(numeros, 0, numeros.length - 1);
        
        System.out.println("Ordenado");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

    }
}
