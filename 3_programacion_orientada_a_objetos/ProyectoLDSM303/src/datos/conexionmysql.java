/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author mavel
 */
public class conexionmysql {

    Connection conn;
    Statement p;
    ResultSet r;

    public void Conexion(String basedatos) throws SQLException {
        conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/" + basedatos, "root", "Miguel2007@");
      
    }
    
    public Connection getConnection(){
        return conn;
    }

    
    
}
