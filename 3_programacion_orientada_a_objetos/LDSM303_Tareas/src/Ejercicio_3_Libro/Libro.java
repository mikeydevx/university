/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_3_Libro;

/**
 *
 * @author mavel
 */
public class Libro {

    private String ISBN = "";
    private String titulo = "";
    private String autor = "";
    private int numeroPaginas = 0;

    public Libro() {

    }

    public Libro(String ISBN, String titulo, String autor, int numeroPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getISBN() {
        return this.ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas() {
        return this.numeroPaginas;
    }

    public String mostrarDatos() {
        return "El titulo " + this.getTitulo() + " con ISBN: " + this.getISBN()
                + " creado por el autor " + this.getAutor() + " tiene " + this.getNumeroPaginas() + " paginas";
    }
}
