/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta_26;

/**
 *
 * @author mavel
 */
public class Empleado {
   private String nombre; 
   private String cedula; 
   private int edad;
   private boolean casado;
   private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, String cedula, int edad, boolean casado, double salario) {
        this.nombre = nombre;
        this.cedula = cedula;
        setEdad(edad);
        this.casado = casado;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad>=18 && edad<=45) {
            this.edad=edad;
        }else{
            this.edad = 18;
        }
    }

    public boolean getCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }
   
    public String clasificacion(){
        if (this.edad<21) {
            return "Principiante";
        }else if(this.edad>=22 && this.edad<=35){
            return "Intermedio";
        }else{
            return "Senior";
        }      
    }
    
    public void aumentarSalario(double porcentaje){
        this.salario += (this.salario * (porcentaje/100));
    }
   
    public String mostrarDatos() {
        return "Nombre: " + this.getNombre() + "\n" +
               "Cedula: " + this.getCedula() + "\n" +
               "Edad: " + this.getEdad() + "\n" +
               "Clasificacion: " + this.clasificacion() + "\n" +
               "Casado: " + this.getCasado() + "\n" +
               "Salario: " + this.getSalario();
    }
        
}