/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_5_Polimorfismo;

/**
 *
 * @author mavel
 */
public class Alumnos {

    public double calcularPromedio(double examenFinal) {
        return examenFinal;
    }

    public double calcularPromedio(double examenFinal, double parcial) {
        return (examenFinal + parcial) / 2;
    }

    public double calcularPromedio(double examenFinal, double parcial, double proyecto) {
        return (examenFinal + parcial + proyecto) / 3;
    }

}
