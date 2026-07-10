/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_18_Empresa;

/**
 *
 * @author mavel
 */
public class Empleado {
    private String id_empleado;
    private String nombre;
    private int edad; 
    private float sueldo; 
    private int antiguedad;

    public Empleado() {
    }

    public Empleado(String id_empleado, String nombre, int edad, float sueldo, int antiguedad) {
        this.id_empleado = id_empleado;
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
        this.antiguedad = antiguedad;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(String id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    
    
    
}
