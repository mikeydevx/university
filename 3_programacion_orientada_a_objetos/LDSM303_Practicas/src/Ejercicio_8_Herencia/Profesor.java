/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_8_Herencia;

/**
 *
 * @author mavel
 */
public class Profesor extends Persona{
    
    private int sueldo;

    public Profesor(int sueldo) {
        this.sueldo = sueldo;
    }

    public Profesor(String id, String nombre, int sueldo) {
        super(id, nombre);
        this.sueldo = sueldo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
    @Override
    public String mostrarDatos(){
        return super.mostrarDatos() + "\n" +
              "Sueldo: " + this.getSueldo();
    }
    
}
