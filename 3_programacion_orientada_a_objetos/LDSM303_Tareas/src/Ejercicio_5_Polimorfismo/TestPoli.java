/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_5_Polimorfismo;

/**
 *
 * @author mavel
 */
public class TestPoli {

    public static void main(String[] args) {

        Alumnos juan = new Alumnos();

        System.out.println("Promedio examen final: " + juan.calcularPromedio(10));
        System.out.println("Promedio examen final y parcial: " + juan.calcularPromedio(10, 9.5));
        System.out.println("Promedio examen final, parcial y proyecto: " + juan.calcularPromedio(10, 9.5, 8.9));

    }
}
