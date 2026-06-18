/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_8_Herencia;

/**
 *
 * @author mavel
 */
public class Persona {

    private String id;
    private String nombre;

    public Persona() {
    }

    public Persona(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String mostrarDatos(){
        return "ID: " + this.getId() + "\n" +
                "Nobre: "+ this.getNombre();
                
    }
    
}
