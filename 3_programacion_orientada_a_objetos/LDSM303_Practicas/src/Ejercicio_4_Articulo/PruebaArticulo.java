package Ejercicio_4_Articulo;

import java.util.Scanner;

public class PruebaArticulo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int c;

        Articulo foco = new Articulo();

        foco.setIDarticulo("01");
        foco.setDescripcion("Foco led azul");
        foco.setExistencia(100);
        foco.setPrecio(200);

        System.out.println(foco.mostrarDatos());

        Articulo camara = new Articulo("02", "Camara", 100, 25);
        System.out.println(camara.mostrarDatos());
        foco.ventaArticulo(10);
        System.out.println(foco.mostrarDatos());

    }

}
