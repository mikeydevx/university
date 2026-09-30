/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad;

import java.util.Scanner;

/**
 *
 * @author mavel
 */
public class Ejercicio_2 {
    
    public static void serie(int n){
        if(n==1){
            System.out.println(n + " ");
        }else{
            serie(n-1);
            System.out.println(n + " ");
        }
    }
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa n: ");
        int n = leer.nextInt();    
        serie(n);
    
    }
}
