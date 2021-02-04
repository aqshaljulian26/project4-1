/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Model.Daftar;
import DAO.EditDAO;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Rizky A. Darmawan
 */
public class EditServlet extends HttpServlet {

   
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
       
         String id_daftar  = request.getParameter("id_daftar");
           String nama  = request.getParameter("nama");
           String tempatlahir  = request.getParameter("tempatlahir");
           String jeniskelamin  = request.getParameter("jeniskelamin");
           String alamat   =request.getParameter("alamat");
           String asalsekolah  = request.getParameter("asalsekolah");
           String pilihana = request.getParameter("pilihana");
           
           
           
            Daftar data = new Daftar();
            data.setId_daftar(id_daftar);
            data.setNama(nama); 
            data.setTempatlahir(tempatlahir); 
            data.setJeniskelamin(jeniskelamin); 
            data.setAlamat(alamat); 
            data.setAsalsekolah(asalsekolah); 
            data.setPilihana(pilihana); 
           
           
           Daftar daf = new Daftar (id_daftar, nama, tempatlahir, jeniskelamin, alamat, asalsekolah, pilihana);
           EditDAO dao = new EditDAO();
           dao.editData(daf);
           
           
           RequestDispatcher dp = request.getRequestDispatcher("viewdata.jsp");
	dp.forward(request, response);
    }


   
     @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

   