/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Second
 */
public class koneksi {
    
    private Connection conn; 
    
    private java.sql.Connection con;

    public koneksi() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pbokelompok","root","");
    }

    public java.sql.Connection getCon() {
        return con;
    }
    
}
