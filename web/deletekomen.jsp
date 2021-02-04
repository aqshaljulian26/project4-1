<%-- 
    Document   : deletekomen
    Created on : Jul 19, 2020, 6:51:56 PM
    Author     : Putri Arina Kamilia
--%>




<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Controller.DataComment"%>
<jsp:useBean id="b" class="Model.Comment"></jsp:useBean>
<jsp:setProperty property="*" name="b" />

<%
   
    DataComment.delete(b);
    response.sendRedirect("viewcomment.jsp");
%>
