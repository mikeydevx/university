/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_12_Operaciones;

import java.util.Scanner;

/**
 *
 * @author mavel
 */
public class TestOperaciones {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       
        Operaciones op = new Operaciones();
        
        System.out.println("La suma de 5 + 2= " + op.Suma(5, 2));
        System.out.println("La suma de 5 + 2 + 2 = " + op.Suma(5, 2, 2));
        System.out.println("La suma de + 2.5 + 3.1 + 1.0 = " + op.Suma(2.5, 3.1, 1.0));
        System.out.println("La resta de 2 - 2= " + op.Resta(2, 2));
        System.out.println("La resta de 5 - 2 - 2 = " + op.Resta(5, 2, 2));
        System.out.println("La multiplicacion de  2 * 2 = " + op.Multiplicacion(2, 2));
        System.out.println("La multiplicacion de  2 * 2 *10 = " + op.Multiplicacion(2, 2, 10));
        System.out.println("La division de  2 / 2 = " + op.Division(2, 2));
        System.out.println("La division de  (5 / 2)/10  = " + op.Division(2, 5, 10));
        
        
        
        
    }

}
