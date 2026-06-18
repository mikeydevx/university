/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_4_Empleado;

/**
 *
 * @author mavel
 */
public class TestEmpleado {

    public static void main(String[] args) {

        Empleado empleado1 = new Empleado();

        empleado1.setNombre("Miguel");
        empleado1.setEdad(19);
        empleado1.setPuesto("Programador");
        empleado1.setSalario(50000.0);

        Empleado empleado2 = new Empleado("Juan", 25, "Armador", 15000.0);

        System.out.println("--- Empleado 1 ---");
        System.out.println(empleado1.mostrarDatos());

        System.out.println("\n--- Empleado 2 ---");
        System.out.println(empleado2.mostrarDatos());

        System.out.println("\nTotal de empleados en el sistema: " + Empleado.getContador());

    }

}
