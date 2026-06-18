/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_15_CodigoBarras;

import java.io.IOException;

/**
 *
 * @author mavel
 */
public class TestAlumnos {
    public static void main(String[] args) throws IOException {
        Alumnos [] datos = new Alumnos [5];
        
        datos[0] = new Alumnos("25000942", "Miguel Angel", "Velazquez", "Zamilpa");
        datos[1] = new Alumnos("25000221", "Joanna Berenice", "Duran", "Zuniga");
        datos[2] = new Alumnos("25000232", "Jose de Jesus", "Nicasio", "Torres");
        datos[3] = new Alumnos("25002100", "Miguel Angel", "Diosdado", "Caudillo");
        datos[4] = new Alumnos("25001407", "Edma Ximena", "Palacios", "Villafana");
        
        RegistroAsistencia formulario = new RegistroAsistencia(datos);
        formulario.setVisible(true);
        
    }
}
