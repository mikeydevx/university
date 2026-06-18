/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_9_Peliculas;

import java.util.Scanner;

/**
 *
 * @author mavel
 */
public class TestPelicula {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String titulo, productor, sinopsis, genero;
        int opcion;

        Pelicula[] datos = new Pelicula[5];

        System.out.println("Ingresa los datos del arreglo pelicula");

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingres datos pelicula " + (i + 1) + "\n");
            System.out.print("Titulo: ");
            titulo = leer.nextLine();
            System.out.print("Productor: ");
            productor = leer.nextLine();
            System.out.print("Sinopsis: ");
            sinopsis = leer.nextLine();
            System.out.println("Genero: ");
            genero= leer.nextLine();

            datos[i] = new Pelicula(titulo, productor, sinopsis);

        }

        System.out.println("\n");
        do {
            System.out.println("\n");
            System.out.println("1." + datos[0].getTitulo());
            System.out.println("2." + datos[1].getTitulo());
            System.out.println("3." + datos[2].getTitulo());
            System.out.println("4." + datos[3].getTitulo());
            System.out.println("5." + datos[4].getTitulo());
            System.out.println("0. Salir\n");

            System.out.print("Ingresa una opcion: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(datos[0].mostrarDatos());
                    break;
                case 2:
                    System.out.println(datos[1].mostrarDatos());
                    break;
                case 3:
                    System.out.println(datos[2].mostrarDatos());
                    break;
                case 4:
                    System.out.println(datos[3].mostrarDatos());
                    break;
                case 5:
                    System.out.println(datos[4].mostrarDatos());
                    break;
                default:
                    System.out.println("Opcion no validad");

            }

        } while (opcion != 0);

    }
}
