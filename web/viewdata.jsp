<%-- 
    Document   : viewdata
    Created on : Jul 19, 2020, 7:03:47 PM
    Author     : Putri Arina Kamilia
--%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="Model.Daftar"%>
<%@page import="DAO.ViewDaftarDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/style2.css">
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <link rel="icon" type="text/css" href="images/webschool.jpg">
        <title>WebSchool</title>
        <style>
        body{
            background-color: white;
        }
        .isi{
            position: absolute;
            top: 20%;
            left: 10%;
        }
    </style>

    </head>
    <body>
         <div class="main">
			<ul>
				<li><a href="viewdata.jsp">See Registant Data</a></li>
				<li><a href="viewcomment.jsp">Message</a></li>
			</ul>
		</div>
        <div class="logo">
            <a href="homeadmin.jsp"><img src="images/webschool.jpg" height="100" width="150"></a>
		</div>
        
        <div class="isi">
        <%@page import="DAO.DaftarDAO,Model.Daftar,java.util.*"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        
           <%
           ViewDaftarDAO dao = new ViewDaftarDAO();
            List<Daftar> daf = dao.showAllData();
            request.setAttribute("data", daf);
        %>
            
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <h1>Registered</h1>
        <br/>
        <br/>
        <br/>
        <table border="1" width="150%">
            
            <tr><th>No</th>
                <th>Name</th>
                <th>Birth of Date</th>
                <th>Gender</th>
                <th>Address</th>
                <th>School Origin</th>
                <th>Major</th>
                <th>Edit</th>
                <th>Delete</th>
            </tr>
            
            <c:forEach items ="${data}" var="b">
                
            <tr>
                <td>${b.getId_daftar()}</td>
                <td>${b.getNama()}</td>
                <td>${b.getTempatlahir()}</td>
                <td>${b.getJeniskelamin()}</td>
                <td>${b.getAlamat()}</td>
                <td>${b.getAsalsekolah()}</td>
                <td>${b.getPilihana()}</td>
                
         
            <td><a href="editform.jsp?id_daftar=${b.getId_daftar()}">Edit</a></td>
            <td><a href="DelServlet?id_daftar=${b.getId_daftar()}">Delete</a></td>
                </tr>
            </c:forEach>
        </table>
        </div>

    </body>
</html>
