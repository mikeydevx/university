/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_1_Cuenta;

import javax.swing.JOptionPane;

/**
 *
 * @author mavel
 */
public class TestCuenta {

    public static void main(String[] args) {
        String numeroCuenta, titular, cantidadTexto, saldoTexto;
        double cantidadDecimal, saldoDecimal;

        // 1. Instanciar usando el constructor con parámetros
        Cuenta cuenta1 = new Cuenta("1001", "Miguel", 1000);
        cuenta1.deposito(90);
        cuenta1.retiro(100);
        JOptionPane.showMessageDialog(null, cuenta1.mostrarDatos());

        // 2. Pidiendo datos
        Cuenta cuenta2 = new Cuenta();
        titular = JOptionPane.showInputDialog("Titular");
        cuenta2.setTitular(titular);
        numeroCuenta = JOptionPane.showInputDialog("Numero Cuenta");
        cuenta2.setNumeroCuenta(numeroCuenta);
        saldoTexto = JOptionPane.showInputDialog("Saldo inicial");
        saldoDecimal = Double.parseDouble(saldoTexto);
        cuenta2.setSaldo(saldoDecimal);

        String menu = "Banco miguel" + "\n"
                + "1. Depositar" + "\n"
                + "2. Retirar" + "\n"
                + "3. Ver datos" + "\n"
                + "4. Salir" + "\n"
                + "---------------------------" + "\n"
                + "ELIGE UNA ACCION";

        int op;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (op) {
                case 1:
                    cantidadTexto = JOptionPane.showInputDialog("Cantidad");
                    cantidadDecimal = Double.parseDouble(cantidadTexto);
                    cuenta2.deposito(cantidadDecimal);
                    JOptionPane.showMessageDialog(null, cuenta2.mostrarDatos());
                    break;

                case 2:
                    cantidadTexto = JOptionPane.showInputDialog("Cantidad");
                    cantidadDecimal = Double.parseDouble(cantidadTexto);
                    cuenta2.retiro(cantidadDecimal);
                    JOptionPane.showMessageDialog(null, cuenta2.mostrarDatos());
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, cuenta2.mostrarDatos());
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, "Programa finalizado");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                    break;
            }

        } while (op != 4);

        //JOptionPane.showMessageDialog( null, cuenta2.mostrarDatos());
    }
}
