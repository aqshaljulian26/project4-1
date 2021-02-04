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
public class User {
    private int id_admin;
    private String username,password;

    public User(int id_admin, String username, String password){
        this.id_admin=id_admin;
        this.username=username;
        this.password=password;
    }
    public User(){
        
    }

    /**
     * @return the id_admin
     */
    public int getId_admin() {
        return id_admin;
    }

    /**
     * @param id_admin the id_admin to set
     */
    public void setId_admin(int id_admin) {
        this.id_admin = id_admin;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
