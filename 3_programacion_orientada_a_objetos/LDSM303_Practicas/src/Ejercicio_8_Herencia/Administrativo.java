/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_8_Herencia;

/**
 *
 * @author mavel
 */
public class Administrativo extends Persona {
    private String departamento;

    public Administrativo(String departamento) {
        this.departamento = departamento;
    }

    public Administrativo(String id, String nombre, String departamento) {
        super(id, nombre);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String mostrarDatos(){
        return super.mostrarDatos() + "\n" + 
               "Departamento: " + this.getDepartamento();
    }
    
}
