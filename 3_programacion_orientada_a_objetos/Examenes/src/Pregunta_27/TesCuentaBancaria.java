/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta_27;

/**
 *
 * @author mavel
 */
public class TesCuentaBancaria {

    public static void main(String[] args) {

        System.out.println("--- INICIANDO PRUEBA DE CUENTA BANCARIA ---");

        // 1. Instanciamos la clase con un saldo inicial de 1000
        CuentaBancaria c = new CuentaBancaria(1000.0);
        System.out.println("Saldo inicial de la cuenta: " + c.getSaldo());

        // 2. Retiramos 200
        System.out.println("\nRetirando 200...");
        c.retirar(200.0);
        System.out.println("Saldo actual: " + c.getSaldo());

        // 3. Intentamos retirar 1000
        System.out.println("\nRetirando 1000...");
        c.retirar(1000.0);
        // Aquí se debe disparar tu mensaje de no permitido

        System.out.println("Saldo final de la cuenta: " + c.getSaldo()); // El saldo sigue igual

        // 4. Probamos el depósito para confirmar que el método funciona
        System.out.println("\nDepositando 500...");
        c.depositar(500.0);
        System.out.println("Saldo despues de depositar: " + c.getSaldo()); // Debe subir 
    }

}