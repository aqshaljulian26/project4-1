/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Putri Arina Kamilia
 */
public class DBConnection {
    private Connection connection = null;
    
    public Connection setConnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/universityy";
            String user = "root";
            String pass = "";
            String db = "universityy";
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }return  connection;
    } 
    
}
