package Ejercicio_1_Cuenta;

import javax.swing.JOptionPane;

public class Cuenta {

    private String numeroCuenta;
    private String titular;
    private double saldoDecimal;

    //construtor vacio
    public Cuenta() {

    }

    //construtor no vacio
    public Cuenta(String numeroCuenta, String titular, double saldoDecimal) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.setSaldo(saldoDecimal);
        
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNumeroCuenta() {
        return this.numeroCuenta;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setSaldo(double saldoDecimal) {
        if (saldoDecimal >= 0) {
            this.saldoDecimal = saldoDecimal;
        } else {
            this.saldoDecimal = 0;
            JOptionPane.showMessageDialog(
                    null, // Componente padre (null para centrar en pantalla)
                    "No deber ser negativo el saldoDecimal", // Mensaje
                    "Error en ingresar datos", // Título
                    JOptionPane.ERROR_MESSAGE // Icono de error
            );
        }
    }

    public double getSaldo() {
        return this.saldoDecimal;

    }

    public double deposito(double cantidadDecimal) {
        if (cantidadDecimal >= 0) {
            this.saldoDecimal += cantidadDecimal;
        } else {
            JOptionPane.showMessageDialog(
                    null, // Componente padre (null para centrar en pantalla)
                    "No deber ser negativo", // Mensaje
                    "No se pudo hacer el deposito", // Título
                    JOptionPane.ERROR_MESSAGE // Icono de error
            );
        }

        return this.saldoDecimal;
    }
    
    public double retiro(double cantidadDecimal){
        if (cantidadDecimal >=0 && this.saldoDecimal>=cantidadDecimal) {
            this.saldoDecimal-=cantidadDecimal;
        }else if(this.saldoDecimal<cantidadDecimal){
            JOptionPane.showMessageDialog(
                    null, // Componente padre (null para centrar en pantalla)
                    "Fondos insuficientes", // Mensaje
                    "No se pudo hacer el retiro", // Título
                    JOptionPane.ERROR_MESSAGE // Icono de error
            );
        }
        
        return this.saldoDecimal; 
    }

    public String mostrarDatos() {
        return "Titular: " + this.getTitular() + "\n"
                + "Numero cuenta " + this.getNumeroCuenta() + "\n"
                + "Saldo: " + this.getSaldo();
    }

}
