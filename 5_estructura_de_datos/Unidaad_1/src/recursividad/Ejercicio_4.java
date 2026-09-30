package recursividad;

import java.util.Scanner;

public class Ejercicio_4 {

    public static int exponenciacion(int x, int y) {
        if (y == 1) {
            return x;
        } else {
            return x * (exponenciacion(x, y - 1));
        }

    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int x, y;

        System.out.print("Ingresa X: ");
        x = leer.nextInt();
        System.out.print("Ingresa Y: ");
        y = leer.nextInt();

        int resultado = exponenciacion(x, y);

        System.out.println("El resultado es: " + resultado);

    }

}
