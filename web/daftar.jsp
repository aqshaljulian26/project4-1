<%-- 
    Document   : daftar
    Created on : Jul 19, 2020, 7:10:19 PM
    Author     : Putri Arina Kamilia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>WebSchool</title>
        <meta name="description" content="Project">
	
        <link rel="stylesheet" type="text/css" href="css/daftar.css">
	<link rel="icon" type="text/css" href="images/webschool.jpg">

    </head>
    <body>
        <div class="warp">
	<header>
		<div class="main">
			<ul>
                            <li><a href="home.jsp">Home</a></li>
                            <li><a href="info.jsp">About Us</a></li>
                            <li><a href="galeri.jsp">Gallery</a></li>
                            <li><a href="hub.jsp">FeedBack</a></li>
                            <li><a href="login.jsp">SignUp/Login</a></li>
			</ul>
		</div>
		<div class="logo">
                    <a href="home.jsp"><img src="images/webschool.jpg" height="100" width="150"></a>
		</div>

		<div class="for">
                    <br>
                    <br>
                    <br>
                    <br>
                    <br>
                    <br>
                    <br>
                    <br>
                    <br>
                    <br>
                     <br>
                    <br>
                    <br>
                    <br>
                    <br>
                    <br>
                    <br>
                    <br>
                    <br>
                    <br>
			<h2><font color="blueviolet">New Student Registration Form</font></h2> 
		</div>
            <div class="daftar">
                    <form action="DaftarServlet" method="post">
			<table>
    
                            <tr>
				<td><b><font color="blueviolet">Full Name</font></b></td>
				<td><input type="text" name="nama" size="49" required /></td>
                            </tr>
                            <br>
                            <br>
                            <br>
                            
                            <tr>
				<td><b><font color="blueviolet">Birth of Date</font></b></td>
				<td><input type="text" name="tempatlahir"  size="49" required /></td>
                            </tr>
                            <br>
                            <br>
                            <br>
                            <tr>
				<td><b><font color="blueviolet">Gender</font></b></td>
                                <td><input type="text" name="jeniskelamin" size="49" required/></td>
                            </tr>
                            <tr>
				<td><b><font color="blueviolet">Address</font></b></td>
				<td><input type="text" name="alamat" size="49" required/></td>
                            </tr>
                            <tr>
				<td><b><font color="blueviolet">School Origin</font></b></td>
				<td><input type="text" name="asalsekolah" size="49" required/></td>
                            </tr>
          
                            <tr>
                                <td><b><font color="blueviolet">Major that you want to choose</font></b></td>
                                <td><input  type="text" name="pilihana" size="49"required/></td>
                            </tr>
                    
				<td colspan="3" align="right">
                                    <br/>
                                    <a href="daftar.jsp"><input type="submit" value="Send" /></a>
				<button type="reset">Reset</button></td>
                            </tr>
                            
			</table>
                    </form>
		</div>
	</header>
</div>

    </body>
</html>
