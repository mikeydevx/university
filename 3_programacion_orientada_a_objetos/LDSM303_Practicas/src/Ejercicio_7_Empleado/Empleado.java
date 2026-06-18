/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_7_Empleado;

/**
 *
 * @author mavel
 */
public class Empleado {

    private String IdEmpleado;
    private String nombre;
    private String puesto;
    private double sueldo;

    public Empleado() {

    }

    ;
    
    public Empleado(String idempleado, String nombre, String puesto, double sueldo) {
        this.IdEmpleado = idempleado;
        this.nombre = nombre;
        this.puesto = puesto;
        this.sueldo = sueldo;
    }

    public void setIdempleado(String idempleado) {
        this.IdEmpleado = idempleado;
    }

    public String getIdempleado() {
        return this.IdEmpleado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getPuesto() {
        return this.puesto;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return this.sueldo;
    }
    
    

}
