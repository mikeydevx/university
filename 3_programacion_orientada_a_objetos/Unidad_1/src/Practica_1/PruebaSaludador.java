package Practica_1;

import java.util.Scanner;

public class PruebaSaludador {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre; 
        
        System.out.println("Ingresa el nombre: ");
        nombre = entrada.nextLine();

        Saludador obj1 = new Saludador();
        System.out.println(obj1);
    }
}
