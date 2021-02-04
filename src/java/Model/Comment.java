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
public class Comment {
    private String id_komen;
    private String nama;
    private String email;
    private String pesan;
    
    public Comment(String id_komen, String nama, String email, String pesan){
        this.id_komen=id_komen;
        this.nama=nama;
        this.email=email;
        this.pesan=pesan;
       
    }
    public Comment(){
    }
    /**
     * @return the id_komen
     */
    public String getId_komen() {
        return id_komen;
    }

    /**
     * @param id_komen the id_komen to set
     */
    public void setId_komen(String id_komen) {
        this.id_komen = id_komen;
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
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the pesan
     */
    public String getPesan() {
        return pesan;
    }

    /**
     * @param pesan the pesan to set
     */
    public void setPesan(String pesan) {
        this.pesan = pesan;
    }
    
}
