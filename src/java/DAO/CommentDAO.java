/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import static DAO.DaftarDAO.conn;
import Model.Comment;
import Model.Daftar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Putri Arina Kamilia
 */
public class CommentDAO {
    static Connection conn;
    static PreparedStatement ps;
    static String sql;
    
    public void insertData(Comment data){
        try {
            conn = new DBConnection().setConnection();
            ps = conn.prepareStatement("INSERT INTO komen(nama,email,pesan) values( ?, ?, ?)");
            
            ps.setString(1, data.getNama());
            ps.setString(2, data.getEmail());
            ps.setString(3, data.getPesan());
          
          

            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}