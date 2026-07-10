/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author mavel
 */
public class Alumno {
    private String Matricula;
    private String Nombre;
    private String Grupo;

    public Alumno() {
    }
    public Alumno(String Matricula, String Nombre, String Grupo) {
        this.Matricula = Matricula;
        this.Nombre = Nombre;
        this.Grupo = Grupo;
    }

    public String getGrupo() {
        return Grupo;
    }

    public void setGrupo(String Grupo) {
        this.Grupo = Grupo;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricuala) {
        this.Matricula = Matricuala;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    
    
}


