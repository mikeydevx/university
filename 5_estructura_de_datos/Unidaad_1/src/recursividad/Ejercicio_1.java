
package recursividad;

import java.util.Scanner;

public class Ejercicio_1 {

    public static int suma(int n) {
        if (n == 1) {//caso base
            return 1;
        } else {
            return n + suma(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int resultado;
        System.out.print("N: ");
        int n = leer.nextInt();
        
        resultado=suma(n);
        System.out.println("suma= " + resultado);


    }

}
