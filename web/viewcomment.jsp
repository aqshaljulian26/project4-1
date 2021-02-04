<%-- 
    Document   : viewcomment
    Created on : Jul 19, 2020, 7:00:24 PM
    Author     : Putri Arina Kamilia
--%>

<%@page import="DAO.ViewCommentDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="Model.Comment"%>
<%@page import="DAO.CommentDAO"%>
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
        <%@page import="DAO.CommentDAO,Model.Comment,java.util.*"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        <%
            ViewCommentDAO dao = new ViewCommentDAO();
            List<Comment> com = dao.showAllData();
            request.setAttribute("list", com);
        %>
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
       
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <h1>FeedBack</h1>
        <br/>
        <br/>       
        <table border="1" width="130%">
            <tr><th>No.</th>
                <th>Name</th>
                <th>E-mail</th>
                <th>Critic and Suggest</th>
                <th>Delete</th></tr>
                <c:forEach items ="${list}" var="b">
                    <tr><td>${b.getId_komen()}</td>
                        <td>${b.getNama()}</td>
                        <td>${b.getEmail()}</td>
                        <td>${b.getPesan()}</td>
                        <td><a href="DelcomServlet?id_komen=${b.getId_komen()}">Delete</a></td></tr> 
                </c:forEach>
        </table>
        </div>

    </body>
</html>
