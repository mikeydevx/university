/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_4_Empleado;

/**
 *
 * @author mavel
 */
public class Empleado {

    private String IdEmpleado;
    private String nombre;
    private int edad;
    private String puesto;
    private double salario;
    private static int contador = 0;

    public Empleado() {
        int year;
        year = java.time.Year.now().getValue();
        this.IdEmpleado = "E_" + year + "_" + contador++;
    }

    public Empleado(String nombre, int edad, String puesto, double salario) {
        int year;
        year = java.time.Year.now().getValue();
        this.IdEmpleado = "E_" + year + "_" + contador++;
        this.nombre = nombre;
        this.edad = edad;
        this.puesto = puesto;
        this.salario = salario;

    }

    public String getIdEmpleado() {
        return this.IdEmpleado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getPuesto() {
        return this.puesto;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }

    public static int getContador() {
        return contador;
    }

    public String mostrarDatos() {
        return "Nombre: " + this.getNombre() + "\n"
                + "ID Empleado: " + this.getIdEmpleado() + "\n"
                + "Edad: " + this.getEdad() + "\n"
                + "Puesto: " + this.getPuesto() + "\n"
                + "Salario: " + this.getSalario();
    }

}
