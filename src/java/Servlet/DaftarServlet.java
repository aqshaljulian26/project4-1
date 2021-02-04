/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;


import DAO.DaftarDAO;
import Model.Daftar;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Putri Arina Kamilia
 */
public class DaftarServlet extends HttpServlet {
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id_daftar = request.getParameter("id_daftar");
        String nama = request.getParameter("nama");
        String tempatlahir = request.getParameter("tempatlahir");
        String jeniskelamin = request.getParameter("jeniskelamin");
        String alamat = request.getParameter("alamat");
        String asalsekolah = request.getParameter("asalsekolah");
        String pilihana = request.getParameter("pilihana");
        
        Daftar register = new Daftar(id_daftar,nama, tempatlahir, jeniskelamin, alamat, asalsekolah, pilihana);
        DaftarDAO dao = new DaftarDAO();
        dao.insertData(register);
        
    
        request.setAttribute("data", register);
        
        RequestDispatcher dp =request.getRequestDispatcher("daftar.jsp");
        dp.forward(request, response);
    }
    
    

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
