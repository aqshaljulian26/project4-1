/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Comment;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 *
 * @author Rizky A. Darmawan
 */
public class KomenDelDAO {
     static Connection conn;
    static PreparedStatement ps;
    static String sql;
    
    public void deleteKomen(Comment model){
        try{
            conn= new DBConnection().setConnection();
            sql = "DELETE FROM komen where id_komen=?";
            ps = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, model.getId_komen());
            
            ps.executeUpdate();
           
           
    }
        catch(Exception e){
            System.out.println("Error " + e.getMessage());
            }
       
}
}

