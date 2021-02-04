/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

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
public class ViewDaftarDAO {
    static Connection conn;
    static PreparedStatement ps;
    static String sql;
    
    public List<Daftar>showAllData(){
        List<Daftar> list=new ArrayList<Daftar>();
        try{
            conn= new DBConnection().setConnection();
             sql = "SELECT * FROM daftar";
            ps = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Daftar data = new Daftar();
                
                data.setId_daftar(rs.getString("id_daftar"));
                data.setNama(rs.getString("nama"));
                data.setTempatlahir(rs.getString("tempatlahir"));
                data.setJeniskelamin(rs.getString("jeniskelamin"));
                data.setAlamat(rs.getString("alamat"));
                data.setAsalsekolah(rs.getString("asalsekolah"));
                data.setPilihana(rs.getString("pilihana"));
                
                list.add(data);
            }
    }
        catch(Exception e){
            System.out.println("Error " + e.getMessage());
            }
        return list;
    
}
}