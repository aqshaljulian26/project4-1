/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

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
public class ViewCommentDAO {
    static Connection conn;
    static PreparedStatement ps;
    static String sql;
    
    public List<Comment>showAllData(){
        List<Comment> list=new ArrayList<Comment>();
        try{
            conn= new DBConnection().setConnection();
             sql = "SELECT * FROM komen";
            ps = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Comment data = new Comment();
                
                data.setId_komen(rs.getString("id_komen"));
                data.setNama(rs.getString("nama"));
                data.setEmail(rs.getString("email"));
                data.setPesan(rs.getString("pesan"));
                list.add(data);
            }
    }
        catch(Exception e){
            System.out.println("Error " + e.getMessage());
            }
        return list;
}
}
