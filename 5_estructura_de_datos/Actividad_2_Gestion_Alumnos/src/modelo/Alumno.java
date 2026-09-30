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
    
    //Declaramos las varibles que vamos a utilizar y las 
    //encapsulamos
    String idAlumno;
    String nombreAlumno;
    int edadAlumno;
    double calificacionFinal;
    
    //Declaramos un construtor vacío
    public Alumno() {
    }

    //Declaramos nuestro construtor no vacío 
    public Alumno(String idAlumno, String nombreAlumno, int edadAlumno, double calificacionFinal) {
        this.idAlumno = idAlumno;
        this.nombreAlumno = nombreAlumno;
        this.edadAlumno = edadAlumno;
        this.calificacionFinal = calificacionFinal;
    }

    //Ponemos cada uno de sus metodos de nuestras variables. 
    
    public String getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(String idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public int getEdadAlumno() {
        return edadAlumno;
    }

    public void setEdadAlumno(int edadAlumno) {
        this.edadAlumno = edadAlumno;
    }

    public double getCalificacionFinal() {
        return calificacionFinal;
    }

    public void setCalificacionFinal(double calificacionFinal) {
        this.calificacionFinal = calificacionFinal;
    }
    
    //Declaramos nuestro metodo toString() para definir cómo se muestra cuando 
    //lo virtamos a texto
    @Override
   public String toString(){
       return idAlumno +"\t" + nombreAlumno +"\t"+ edadAlumno + "\t"+ calificacionFinal;
   }

}
