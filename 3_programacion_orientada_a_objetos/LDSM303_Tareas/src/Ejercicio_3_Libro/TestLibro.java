/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_3_Libro;

/**
 *
 * @author mavel
 */
public class TestLibro {

    public static void main(String[] args) {

        Libro libro1 = new Libro("978-607-319-335-1", "El principito", "Antoine de Saint-Exupery", 120);
        Libro libro2 = new Libro("978-958-8884-06-6", "Cien anios de soledad", "Gabriel Garcia Marquez", 496);

        System.out.println("Libro 1\n");
        System.out.println(libro1.mostrarDatos());
        System.out.println("\nLibro 2\n");
        System.out.println(libro2.mostrarDatos() + "\n");

        if (libro1.getNumeroPaginas() > libro2.getNumeroPaginas()) {
            System.out.println("El libro que tiene mas paginas es: " + libro1.getTitulo());
        } else if (libro1.getNumeroPaginas() == libro2.getNumeroPaginas()) {
            System.out.println("Tienen el mismo numero de paginas");
        } else {
            System.out.println("El libro que tiene mas paginas es: " + libro2.getTitulo());
        }

    }

}
