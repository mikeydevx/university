/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaDeAlquilerDeVehículos;

/**
 *
 * @author mavel
 */
public class Motos extends Vehiculos {
    
    private int cilindraje;

    public Motos(int cilindraje, String marca, String modelo, double precioPorDia) {
        super(marca, modelo, precioPorDia);
        this.cilindraje = cilindraje;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }
    
    @Override
    public String mostrarDetalles(){
        return super.mostrarDetalles() + "\nCilindraje: " + this.getCilindraje();
    }
    
    
}
