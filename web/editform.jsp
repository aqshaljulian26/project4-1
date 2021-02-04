
<%-- 
    Document   : editform
    Created on : Jul 19, 2020, 7:12:26 PM
    Author     : Putri Arina Kamilia
--%>

<%@page import="javax.enterprise.inject.Model"%>
<%@page import="javax.enterprise.inject.Model"%>
<%@page import="Model.Daftar"%>
<%@page import="DAO.EditDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>WebSchool</title>
        <meta name="description" content="Project">
  	<meta name="keywords" content="HTML, CSS, JavaScript, University">
	<link rel="stylesheet" type="text/css" href="css/style2.css">
        <link rel="stylesheet" type="text/css" href="css/edit.css">
	<link rel="icon" type="text/css" href="images/webschool.jpg">
        
        <style>
            body{
                background-color: white;
            }
        </style>

    </head>
    <body>
        
                
         <%
            EditDAO dao = new EditDAO();
            String id_daftar = request.getParameter("id_daftar");
            Daftar data = dao.getDataById(id_daftar);
            
        %>
        
        <h1><font color="white">Edit Form</font></h1>
            <form action="EditServlet" method="GET">
                <input type="hidden" name="id_daftar" value="<%=id_daftar%>" />
                <table>
                    <tr>
			<td><b><font color="blueviolet">Full Name</font></b></td>
			<td align="center"><font color="white">:</font></td>
			<td><input type="text" name="nama" id="nama" size="49" value="<%=data.getNama()%>" /></td>
                    </tr>
                    <tr>
			<td><b><font color="blueviolet">Birth of Date</font></b></td>
			<td align="center"><font color="white">:</font></td>
                        <td><input type="text" name="tempatlahir" id="tempat_lahir" size="49" value="<%=data.getTempatlahir()%>" /></td>
                    </tr>
                    <tr>
			<td><b><font color="blueviolet">Gender</font></b></td>
			<td align="center"><font color="white">:</font></td>
                        <td><input type="text" name="jeniskelamin" id="jenis_kelamin" size="49" value="<%=data.getJeniskelamin()%>" /></td>
                    </tr>
                    <tr>
			<td><b><font color="blueviolet">Address</font></b></td>
			<td align="center"><font color="white">:</font></td>
			<td><input type="text" name="alamat" id="alamat" size="49" value="<%=data.getAlamat()%>" /></td>
                    </tr>
                    <tr>
			<td><b><font color="blueviolet">School Origin</font></b></td>
			<td align="center"><font color="white">:</font></td>
			<td><input type="text" name="asalsekolah" id="asal_sekolah" size="49" value="<%=data.getAsalsekolah()%>" /></td>
                    </tr>
                   
                    <tr>
                        <td><b><font color="blueviolet">Major</font></b></td>
                        <td align="center"><font color="white">:</font></td>
                        <td><input type="text" name="pilihana" id="pilihana" size="49" value="<%=data.getPilihana()%>" /></td>     
                    </tr>
                    <br>
                   
                    <tr><td colspan="3" align="right"><input type="submit" value="Edit Data"/></td></tr>
		</table>
        </form>
        
        <p align="center"><a href="viewdata.jsp">Kembali ke See Registant Data</a></p><br><br>

    </body>
</html>
