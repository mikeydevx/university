/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author mavel
 */
public class Registro {
    
    private String Matricula;
    private String IdConferencia;
    private String Fecha;
    private String Hora; 

    public Registro() {
    }

    public Registro(String Matricula, String IdConferencia, String Fecha, String Hora) {
        this.Matricula = Matricula;
        this.IdConferencia = IdConferencia;
        this.Fecha = Fecha;
        this.Hora = Hora;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public String getIdConferencia() {
        return IdConferencia;
    }

    public void setIdConferencia(String IdConferencia) {
        this.IdConferencia = IdConferencia;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
    
    
    
}
