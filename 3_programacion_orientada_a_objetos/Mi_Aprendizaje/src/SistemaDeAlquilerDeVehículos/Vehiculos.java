/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaDeAlquilerDeVehículos;

/**
 *
 * @author mavel
 */
public class Vehiculos {
    
    private String marca;
    private String modelo; 
    private double precioPorDia;

    public Vehiculos(String marca, String modelo, double precioPorDia) {
        this.marca = marca;
        this.modelo = modelo;
        this.precioPorDia = precioPorDia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecioPorDia() {
        return precioPorDia;
    }

    public void setPrecioPorDia(double precioPorDia) {
        this.precioPorDia = precioPorDia;
    }
    
    public double calcularRenta(int dias){
        return dias * precioPorDia;
    }
    
    
    public String mostrarDetalles() {
        return "Marca " + this.getMarca() + "\n"
                + "Modelo: " + this.getModelo() + "\n"
                + "Renta: " + this.getPrecioPorDia();
    }
    
    
}
