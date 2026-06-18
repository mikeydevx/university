/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_8_Herencia;

/**
 *
 * @author mavel
 */
public class Alumno extends Persona {
    private int edad;

    public Alumno(String id, String nombre, int edad) {
        super(id, nombre);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public String mostrarDatos(){
        return super.mostrarDatos() + "\n" + 
               "Edad: " + this.getEdad();
    }
    
}
