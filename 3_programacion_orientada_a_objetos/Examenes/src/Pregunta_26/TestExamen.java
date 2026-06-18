/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta_26;

/**
 *
 * @author mavel
 */
public class TestExamen {
 
    public static void main(String[] args) {
        // Creación del objeto de prueba para Empleado
        Empleado emp = new Empleado("Roberto Castillo", "CE-45892", 20, false, 12500.0);
        System.out.println(emp.mostrarDatos());
        System.out.println();

        // Creación del objeto de prueba para Programador 
        Programador prog = new Programador(80, "Java", "Juan Perez", "CE-45893", 28, true, 25000.0);
        System.out.println(prog.mostrarDatos());
        System.out.println();

        // Prueba del método aumentarSalario (Ejemplo: 10%)
        System.out.println("--- Despues del aumento del 10% ---");
        prog.aumentarSalario(10.0);
        System.out.println(prog.mostrarDatos());
    }
    
}