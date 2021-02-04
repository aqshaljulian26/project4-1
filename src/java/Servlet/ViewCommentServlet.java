/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import DAO.CommentDAO;
import Model.Comment;
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
public class ViewCommentServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      String id_komen =request.getParameter("id_komen");
      String nama = request.getParameter("nama");
      String email = request.getParameter("email");
      String pesan = request.getParameter("pesan");
      
       Comment com = new Comment(id_komen, nama, email, pesan);
        CommentDAO dao = new CommentDAO();
        dao.insertData(com);
        
    
        request.setAttribute("data", com);
        
        RequestDispatcher dp =request.getRequestDispatcher("viewcomment.jsp");
        dp.forward(request, response);
    }

 
      
   
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
