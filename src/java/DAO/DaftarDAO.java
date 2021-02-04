/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Daftar;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Putri Arina Kamilia
 */
public class DaftarDAO {
    static Connection conn;
    static PreparedStatement ps;
    static String sql;
    
    public void insertData(Daftar data){
        try {
            conn = new DBConnection().setConnection();
            ps = conn.prepareStatement("INSERT INTO daftar(nama,tempatlahir,jeniskelamin,alamat,asalsekolah,pilihana) values( ?, ?, ?, ?, ?, ? )");
            
            ps.setString(1, data.getNama());
            ps.setString(2, data.getTempatlahir());
            ps.setString(3, data.getJeniskelamin());
            ps.setString(4, data.getAlamat());
            ps.setString(5, data.getAsalsekolah());
            ps.setString(6, data.getPilihana());

            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}