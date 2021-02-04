/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import DAO.DBConnection;
import Model.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Putri Arina Kamilia
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    static Connection conn;
    static Statement st;
    static String sql;
    PreparedStatement ps;
    static ResultSet rs;
    User user;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String uname = request.getParameter("username");
            String psw = request.getParameter("password");
            
            DBConnection db = new DBConnection();
            conn = db.setConnection();
            try {
                sql = " SELECT * FROM admin WHERE username =? AND password =?";
                     ps = conn.prepareStatement(sql);
                     ps = conn.prepareStatement(sql);
                     ps.setString(1, uname);
                     ps.setString(2, psw);
                     rs = ps.executeQuery();

                rs = ps.executeQuery();
                if(rs.next()){
                    out.println("<body>");
                    out.println("<script>");
                    out.println("alert('Login Berhasil, Selamat Datang')");
                    out.println("location='homeadmin.jsp';");
                    out.println("</script>");
                    out.println("</body>");
                } else {
                    out.println("<body>");
                    out.println("<script>");
                    out.println("alert('Username atau Password Salah')");
                    out.println("location='loginadmin.jsp';");
                    out.println("</script>");
                    out.println("</body>");
                }
            } catch (Exception e){
                    out.println("<body>");
                    out.println("<script>");
                    out.println("alert('Koneksi Ke Database Gagal')");
                    out.println("location='loginadmin.jsp';");
                    out.println("</script>");
                    out.println("</body>");
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

            
