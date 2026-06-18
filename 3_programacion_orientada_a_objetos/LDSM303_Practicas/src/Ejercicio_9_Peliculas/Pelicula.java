/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_9_Peliculas;

/**
 *
 * @author mavel
 */
public class Pelicula {

    private String IdPelicula;
    private static int contador = 1;
    private String titulo;
    private String productor;
    private String sinopsis;
    private String genero;

    public Pelicula() {

        this.IdPelicula = "P_" + contador++;
    }

    public Pelicula(String titulo, String productor, String sinopsis) {
        this.titulo = titulo;
        this.productor = productor;
        this.sinopsis = sinopsis;
        this.IdPelicula = "P_" + contador++;
    }

    public String getIdEmpleado() {
        return this.IdPelicula;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getProductor() {
        return productor;
    }

    public void setProductor(String productor) {
        this.productor = productor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    

    public String mostrarDatos() {
        return "ID_Pelicula: " + this.IdPelicula + "\n"
                + "Titulo: " + this.getTitulo() + "\n"
                + "Productor: " + this.getProductor() + "\n"
                + "Sinopsis: " + this.getSinopsis() + "\n"
                + "Genero: " + this.getGenero();
    }

}
