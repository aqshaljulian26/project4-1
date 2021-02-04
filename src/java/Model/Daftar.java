/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Putri Arina Kamilia
 */
public class Daftar {
    private String id_daftar;
    private String nama;
    private String tempatlahir;
    private String jeniskelamin;
    private String alamat;
    private String asalsekolah;
    private String pilihana;

    public Daftar(String id_daftar, String nama, String tempatlahir, String jeniskelamin, String alamat, String asalsekolah, String pilihana) {
        this.id_daftar = id_daftar;
        this.nama = nama;
        this.tempatlahir = tempatlahir;
        this.jeniskelamin = jeniskelamin;
        this.alamat = alamat;
        this.asalsekolah = asalsekolah;
        this.pilihana = pilihana;
    }
    

    public Daftar() {
        
    }

    public Daftar(String nama, String tempatlahir, String jeniskelamin, String alamat, String asalsekolah, String pilihana) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the id_daftar
     */
    public String getId_daftar() {
        return id_daftar;
    }

    /**
     * @param id_daftar the id_daftar to set
     */
    public void setId_daftar(String id_daftar) {
        this.id_daftar = id_daftar;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the tempatlahir
     */
    public String getTempatlahir() {
        return tempatlahir;
    }

    /**
     * @param tempatlahir the tempatlahir to set
     */
    public void setTempatlahir(String tempatlahir) {
        this.tempatlahir = tempatlahir;
    }

    /**
     * @return the jeniskelamin
     */
    public String getJeniskelamin() {
        return jeniskelamin;
    }

    /**
     * @param jeniskelamin the jeniskelamin to set
     */
    public void setJeniskelamin(String jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the asalsekolah
     */
    public String getAsalsekolah() {
        return asalsekolah;
    }

    /**
     * @param asalsekolah the asalsekolah to set
     */
    public void setAsalsekolah(String asalsekolah) {
        this.asalsekolah = asalsekolah;
    }

    /**
     * @return the pilihana
     */
    public String getPilihana() {
        return pilihana;
    }

    /**
     * @param pilihana the pilihana to set
     */
    public void setPilihana(String pilihana) {
        this.pilihana = pilihana;
    }
            
    
    
}