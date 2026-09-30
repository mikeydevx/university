package recursividad;

import java.util.Scanner;

public class Ejercicio_3 {

    public static int contarDigitos(int numero) {

        if (numero == 0) {
            return 0;
        } else {
            return 1 + contarDigitos(numero / 10);
        }
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingresa el numero: ");
        int numero = leer.nextInt();

        int cantidad = contarDigitos(numero);

        System.out.println("Cantidad de digitos: " + cantidad);

    }
}
