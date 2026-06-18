/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_2_Persona;

/**
 *
 * @author mavel
 */
public class Persona {

    private String nombre = "";
    private int edad = 0;
    private String IdPersona;
    private static final char SEXO_DEF = 'H';
    private char sexo;
    private double peso = 0;
    private double altura = 0;

    public Persona() {
        this.sexo = SEXO_DEF;
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.setSexo(sexo);
    }

    public Persona(String nombre, int edad, String IdPersona, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.IdPersona = IdPersona;
        this.setSexo(sexo);
        this.peso = peso;
        this.altura = altura;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setIdPersona(String IdPersona) {
        this.IdPersona = IdPersona;
    }

    public String getIdPersona() {
        return this.IdPersona;
    }

    public void setSexo(char sexo) {
        this.comprobarSexo(sexo);
    }

    public char getSexo() {
        return this.sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return this.altura;
    }

    public boolean esMayorDeEdad() {
        if (this.edad >= 18) {
            return true;
        } else {
            return false;
        }

    }

    private void comprobarSexo(char sexo) {
        sexo  = Character.toUpperCase(sexo);
        if (sexo == 'H' || sexo == 'M') {
            this.sexo = sexo;
        } else {
            this.sexo = SEXO_DEF;
        }
    }

    public String calcularIMC() {

        if (this.altura <= 0 || this.peso <= 0) {
            return ("Datos insuficientes para calcular el IMC");
        }

        double IMC = this.peso / (this.altura * this.altura);
        String respuesta = "";

        if (IMC < 18.5) {
            respuesta = "Insuficiente";
        } else if (IMC >= 18.5 && IMC <= 24.9) {
            respuesta = "Normal";
        } else if (IMC >= 25 && IMC <= 29.9) {
            respuesta = "Sobrepeso";
        } else if (IMC >= 30 && IMC <= 34.9) {
            respuesta = "Obesidad";
        } else {
            respuesta = "Obesidad extrema";
        }

        return respuesta;
    }
    
    public String mostrarDatos(){
        return "Nombre: " + this.getNombre() + "\n" + 
                "Edad: " + this.getEdad() + "\n" + 
                "ID_Persona: " + this.getIdPersona() +"\n" + 
                "Sexo: " + this.getSexo() + "\n" + 
                "Peso: " + this.getPeso() + "\n" + 
                "Altura: " + this.getAltura();
    }

}
