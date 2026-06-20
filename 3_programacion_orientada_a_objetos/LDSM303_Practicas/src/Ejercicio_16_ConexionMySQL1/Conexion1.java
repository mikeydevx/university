/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_16_ConexionMySQL1;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author mavel
 */
public class Conexion1 {
    
    
    public static void main(String[] args) throws SQLException {
        
        String bd = "prueba";
        String u = "root";
        String ps = "Miguel2007@";
        String url= "jdbc:mysql://127.0.0.1:3306/" + bd;
        Connection c;
        Statement t;
        ResultSet r;
        
        c = DriverManager.getConnection(url, u, ps);
        t = c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        
        String slq = "Select * from alumnos";
        r = t.executeQuery(slq);
        r.first();
        System.out.println(r.getString(1) + " " + r.getString(2) + " " + r.getString(3) + " " + r.getString(4) );
        
    }
    
}
