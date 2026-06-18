/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_12_Operaciones;

/**
 *
 * @author mavel
 */
public class Operaciones {

    public int Suma(int a, int b) {
        return a + b;
    }

    public int Suma(int a, int b, int c) {
        int OP = 0;

        OP = a + b + c;

        return OP;
    }
    
    public double Suma(double a, double b, double c) {
        return a + b + c;
    }

    public int Resta(int a, int b) {
        return a - b;
    }

    public int Resta(int a, int b, int c) {
        int OP = 0;

        OP = a - b - c;

        return OP;
    }

    public int Multiplicacion(int a, int b) {
        return a * b;
    }

    public int Multiplicacion(int a, int b, int c) {
        int OP = 0;

        OP = a * b * c;

        return OP;
    }

    public double Division(int a, int b) {
        return a / b;
    }

    public double Division(int a, int b, int c) {
        double OP = 0;

        OP = (a / b) / c;

        return OP;
    }

    
}
