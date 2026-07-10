/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author mavel
 */
public class Conferencia {
    private String IdConferencia;
    private String Titulo;
    private String Fecha;
    private String Hora; 
    private String Ubicacion; 
    private String IdConferencista; 

    public Conferencia() {
    }

    public Conferencia(String IdConferencia, String Titulo, String Fecha, String Hora, String Ubicacion, String IdConferencista) {
        this.IdConferencia = IdConferencia;
        this.Titulo = Titulo;
        this.Fecha = Fecha;
        this.Hora = Hora;
        this.Ubicacion = Ubicacion;
        this.IdConferencista = IdConferencista;
    }

    public String getIdConferencista() {
        return IdConferencista;
    }

    public void setIdConferencista(String IdConferencista) {
        this.IdConferencista = IdConferencista;
    }

    public String getIdConferencia() {
        return IdConferencia;
    }

    public void setIdConferencia(String IdConferencia) {
        this.IdConferencia = IdConferencia;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }
    
}
