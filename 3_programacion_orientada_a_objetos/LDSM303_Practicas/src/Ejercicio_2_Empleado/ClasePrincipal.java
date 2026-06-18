package Ejercicio_2_Empleado;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ClasePrincipal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String id;
        String N;
        String P;
        int E;
        int A;

        //Forma 1 datos ya escritos
        Empleado obj1 = new Empleado("01", "Miguel", "Velazquez", 19, 7);

        obj1.calcularSueldo();
        obj1.mostrarDatos();
        System.out.println(obj1.mostrarDatos());

        //Forma 2: pedir datos
        System.out.println("---------------------------");
        System.out.print("Ingresa el id: ");
        id = entrada.nextLine();
        System.out.print("Ingresa nombre: ");
        N = entrada.nextLine();
        System.out.print("Ingresa primer apellido: ");
        P = entrada.nextLine();
        System.out.print("Ingresa edad: ");
        E = Integer.parseInt(entrada.nextLine());
        System.out.print("Anios experencia: ");
        A = Integer.parseInt(entrada.nextLine());
        System.out.println("--------------------------\n");

        Empleado obj2 = new Empleado(id, N, P, E, A);
        obj2.calcularSueldo();
        obj2.mostrarDatos();

        System.out.println(obj2.mostrarDatos());

        System.out.println("------------------\n");

        //Forma 3: modo grafico
        id = JOptionPane.showInputDialog("Id Empleado");
        N = JOptionPane.showInputDialog("Nombre");
        P = JOptionPane.showInputDialog("Primer apellido");
        E = Integer.parseInt(JOptionPane.showInputDialog("Edad"));
        A = Integer.parseInt(JOptionPane.showInputDialog("Años Experiencia"));

        Empleado obj3 = new Empleado(id, N, P, E, A);
        obj3.calcularSueldo();

        JOptionPane.showMessageDialog(null, obj3.mostrarDatos());

    }
}
