/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_16_ConexionMySQL1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author mavel
 */
public class Conexio2 {
    public static void main(String[] args) throws SQLException {
        
        String bd = "prueba";
        String u = "root";
        String ps = "Miguel2007@";
        String url= "jdbc:mysql://127.0.0.1:3306/" + bd;
        Connection c;
        Statement t;
        ResultSet r;
        
        int matricula=25000945; 
        
        for (int i = 0; i < 3; i++) {
            matricula=+matricula+1;
        }
        
        c = DriverManager.getConnection(url, u, ps);
        t = c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        
        //ingresar alumno
        
        String sql1="INSERT INTO alumnos(Matricula,Nombre,PrimerApellido, SegundoApellido, edad)"
                + " values ('25000945', 'Bruno', 'Martinez', 'Juarez', 19)";
        t.executeUpdate(sql1);
        
        t=c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        
        String sql = "Select * from alumnos";
        r = t.executeQuery(sql);
        
        r.beforeFirst();
        
        while (r.next()) {
            System.out.println(r.getString(1) + "\t" + r.getString(2) + "\t" + r.getString(3) + "\t" + r.getString(4) + "\t" + r.getString(5));
            
        }
        
    }
}
