/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen;

/**
 *
 * @author mavel
 */
public class Alumnos {
    private String nombre;
    private double promedio;
    private String matricula;

    public Alumnos() {
    }

    public Alumnos(String nombre, double promedio, String matricula) {
        this.nombre = nombre;
        this.promedio = promedio;
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    public String estatudAlumno(){
        if (this.promedio>=80) {
            return "Alumno chido";
        }else{
            return "Alumno en peligro";
        }
    }
    
    public String mostrarDatos(){
        return "Nombre: " + this.getNombre() + "\n" +
                "Matricula: " + this.getMatricula() + "\n" +
                "Promedio: " + this.getPromedio();
     }
}
