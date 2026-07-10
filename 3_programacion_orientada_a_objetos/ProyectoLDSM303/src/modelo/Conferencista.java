/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author mavel
 */
public class Conferencista {
    private String IdConferencista;
    private String Nombre; 
    private String CV;

    public Conferencista() {
    }

    public Conferencista(String IdConferencista, String Nombre, String CV) {
        this.IdConferencista = IdConferencista;
        this.Nombre = Nombre;
        this.CV = CV;
    }

    public String getCV() {
        return CV;
    }

    public void setCV(String CV) {
        this.CV = CV;
    }

    public String getIdConferencista() {
        return IdConferencista;
    }

    public void setIdConferencista(String IdConferencista) {
        this.IdConferencista = IdConferencista;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
