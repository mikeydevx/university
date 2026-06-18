
package Ejercicio_5_Alumno;

import javax.swing.JOptionPane;
public class Prueba2Alumno {

    public static void main(String[] args) {
        
        
        String m, n, g, c;
        
        Alumno [] datos1 = new Alumno[5];
        
        for (int i = 0; i <= 4; i++) {
            System.out.println("Datos alumno " + (i+1) + "\n");
            m=JOptionPane.showInputDialog("Matricula");
            n=JOptionPane.showInputDialog("Nombre");
            g=JOptionPane.showInputDialog("Grupo");
            c=JOptionPane.showInputDialog("Carrera");
            
            datos1[i]=new Alumno();
            datos1[i].setMatricula(m);
            datos1[i].setNombre(n);
            datos1[i].setGrupo(g);
            datos1[i].setCarrera(c);
        }
        //mostrar datos arreglo con este for
        for (Alumno x:datos1) {
            System.out.println(x.mostrarDatos()+"\t"); 
        }
    }
    
}
