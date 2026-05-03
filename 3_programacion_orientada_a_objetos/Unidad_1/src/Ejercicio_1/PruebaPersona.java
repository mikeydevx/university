package Ejercicio_1;

import java.util.Scanner;

public class PruebaPersona {

   public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        String n;
        int e;
        
        System.out.print("Ingresa nombre: ");
        n = entrada.nextLine();
        System.out.print("Ingresa edad: ");
        e = Integer.parseInt(entrada.nextLine());
        
        Persona p1 = new Persona(n, e);
        
        System.out.println(p1.mostrarDatos());
        
        
    }
}
