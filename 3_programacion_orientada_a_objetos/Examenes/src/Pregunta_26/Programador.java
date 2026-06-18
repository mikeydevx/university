/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta_26;

/**
 *
 * @author mavel
 */
public class Programador extends Empleado {
    
    private int lineasDeCodigoPorHora; 
    private String lenguajeDominante; 

    public Programador() {
    }

    // Se corrigió el typo de "lienasDeCodigoPorHora"
    public Programador(int lineasDeCodigoPorHora, String lenguajeDominante, String nombre, String cedula, int edad, boolean casado, double salario) {
        super(nombre, cedula, edad, casado, salario);
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
        this.lenguajeDominante = lenguajeDominante;
    }

    public int getLineasDeCodigoPorHora() {
        return lineasDeCodigoPorHora;
    }

    // Se corrigió el nombre del setter
    public void setLineasDeCodigoPorHora(int lineasDeCodigoPorHora) {
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
    }

    public String getLenguajeDominante() {
        return lenguajeDominante;
    }

    public void setLenguajeDominante(String lenguajeDominante) {
        this.lenguajeDominante = lenguajeDominante;
    }
    
    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + "\n" +
               "Lineas de codigo por hora: " + this.getLineasDeCodigoPorHora() + "\n" +
               "Lenguaje dominante: " + this.getLenguajeDominante();
    }
    
}