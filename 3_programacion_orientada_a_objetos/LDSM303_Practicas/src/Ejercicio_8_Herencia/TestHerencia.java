/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_8_Herencia;

import java.util.Scanner;

/**
 *
 * @author mavel
 */
public class TestHerencia {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Persona[] datos = new Persona[5];

        datos[0] = new Alumno("101", "Miguel", 19);
        datos[1] = new Profesor("102", "Ivan", 40000);
        datos[2] = new Profesor("103", "Juan", 30000);
        datos[3] = new Alumno("104", "Angel", 17);
        datos[4] = new Administrativo("105", "Marco", "Direccion");

        for (int i = 0; i < 5; i++) {
            System.out.println(datos[i].mostrarDatos() + "\n");
            System.out.println("------------------------------");
        }

    }

}
