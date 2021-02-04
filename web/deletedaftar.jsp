<%-- 
    Document   : deletedaftar
    Created on : Jul 19, 2020, 6:50:13 PM
    Author     : Putri Arina Kamilia
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Controller.DataDaftar"%>
<jsp:useBean id="b" class="Model.Daftar"></jsp:useBean>
<jsp:setProperty property="*" name="b" />
<%@page import="Controller.DataDaftar"%>

<%
    DataDaftar.delete(b);
    response.sendRedirect("viewdata.jsp");
%>
