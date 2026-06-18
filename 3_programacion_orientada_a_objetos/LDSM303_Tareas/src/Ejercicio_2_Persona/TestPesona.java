/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_2_Persona;

import java.util.Scanner;

/**
 *
 * @author mavel
 */
public class TestPesona {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre = "";
        int edad = 0;
        String IdPersona;
        char sexo;
        double peso = 0;
        double altura = 0;

        System.out.print("Nombre: ");
        nombre = entrada.nextLine();
        System.out.print("Edad: ");
        edad = Integer.parseInt(entrada.nextLine());
        System.out.print("ID_Persona: ");
        IdPersona = entrada.nextLine();
        System.out.print("Sexo: ");
        sexo = entrada.nextLine().charAt(0);
        System.out.print("Peso: ");
        peso = Double.parseDouble(entrada.nextLine());
        System.out.print("Altura: ");
        altura = Double.parseDouble(entrada.nextLine());

        Persona persona1 = new Persona(nombre, edad, IdPersona, sexo, peso, altura);
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona();

        persona3.setNombre(nombre);
        persona3.setEdad(edad);
        persona3.setIdPersona(IdPersona);
        persona3.setSexo(sexo);
        persona3.setPeso(peso);
        persona3.setAltura(altura);

        System.out.println("\n");

        System.out.println("Objeto 1");
        System.out.println("Estado de peso: " + persona1.calcularIMC());
        System.out.println("Es mayor de edad? " + persona1.esMayorDeEdad());

        System.out.println("\n");

        System.out.println("Objeto 2");
        System.out.println("Estado de peso: " + persona2.calcularIMC());
        System.out.println("Es mayor de edad? " + persona2.esMayorDeEdad());

        System.out.println("\n");

        System.out.println("Objeto 3");
        System.out.println("Estado de peso: " + persona3.calcularIMC());
        System.out.println("Es mayor de edad? " + persona3.esMayorDeEdad());

        System.out.println("\nINFORMACION DE CADA OBJETO\n");

        System.out.println("Objeto 1\n" + persona1.mostrarDatos() + "\n");
        System.out.println("Objeto 2\n" + persona2.mostrarDatos() + "\n");
        System.out.println("Objeto 3\n" + persona1.mostrarDatos() + "\n");

    }

}
