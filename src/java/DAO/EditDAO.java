/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import static DAO.DaftarDAO.conn;
import static DAO.ViewDaftarDAO.conn;
import Model.Daftar;
import DAO.DaftarDAO;
import DAO.ViewDaftarDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rizky A. Darmawan
 */
public class EditDAO {
    
    static Connection conn;
    static PreparedStatement ps;
    static String sql;
    static ResultSet rs;

   
    
    public static Daftar getDataById(String id_daftar){
          Daftar u = null;
          try{
            conn = new DBConnection().setConnection();
            ps = conn.prepareStatement("select * from daftar where id_daftar=?");
            ps.setString(1, id_daftar);
            rs = ps.executeQuery();
            while (rs.next()) {
                u = new Daftar();
                u.setNama(rs.getString("nama"));
                u.setTempatlahir(rs.getString("tempatlahir"));
                u.setJeniskelamin(rs.getString("jeniskelamin"));
                u.setAlamat(rs.getString("alamat"));
                u.setAsalsekolah(rs.getString("asalsekolah"));
                u.setPilihana(rs.getString("pilihana"));
               
            }
        }catch (Exception e) {
            System.out.println(e);
        }
          return u;
    }
      

          public void editData(Daftar data){
          try{
            conn = new DBConnection().setConnection();
            ps = conn.prepareStatement("update daftar set nama=?, tempatlahir=?, jeniskelamin=?, alamat=?, asalsekolah=?, pilihana=? where id_daftar=?");
            Daftar d = new Daftar();
            ps.setString(1, data.getNama());
            ps.setString(2, data.getTempatlahir());
            ps.setString(3, data.getJeniskelamin());          
            ps.setString(4, data.getAlamat());           
            ps.setString(5, data.getAsalsekolah());           
            ps.setString(6, data.getPilihana());    
            ps.setString(7, data.getId_daftar());
            ps.executeUpdate();
          
          }
          
          
          catch (Exception e) {
            System.out.println(e);
        }
    }
}
