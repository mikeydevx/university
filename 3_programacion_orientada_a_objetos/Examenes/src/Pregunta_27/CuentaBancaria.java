/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta_27;

/**
 *
 * @author mavel
 */
public class CuentaBancaria {

    private double saldo;

    public CuentaBancaria() {

    }
    
    public CuentaBancaria(double saldoInicial) {
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
        }
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            this.saldo = this.saldo + cantidad;
        }
    }

    public void retirar(double cantidad) {
        if (cantidad <= this.saldo) {
            this.saldo = this.saldo - cantidad;
        } else {
            System.out.println("// no permitido");
        }
    }

}
