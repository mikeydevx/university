/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaDeAlquilerDeVehículos;

/**
 *
 * @author mavel
 */
public class Autos extends Vehiculos {
   
    private int cantidadPuertas;

    public Autos(int CantidadPuertas, String marca, String modelo, double precioPorDia) {
        super(marca, modelo, precioPorDia);
        this.cantidadPuertas = CantidadPuertas;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int CantidadPuertas) {
        this.cantidadPuertas = CantidadPuertas;
    }
    
    @Override
    public String mostrarDetalles() {
        return super.mostrarDetalles() + "\nPuertas: " + this.getCantidadPuertas();
    }
    
    
}
