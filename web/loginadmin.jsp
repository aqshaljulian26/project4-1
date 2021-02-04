<%-- 
    Document   : loginadmin
    Created on : Jul 19, 2020, 6:47:01 PM
    Author     : Putri Arina Kamilia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>WebSchool</title>
        <meta name="description" content="Project">
  	<meta name="keywords" content="HTML, CSS, JavaScript, University">
	<link rel="stylesheet" type="text/css" href="css/login.css">
	<link rel="icon" type="text/css" href="images/webschool.jpg">
        
    </head>
    <body>
        <div class="warp">
	<header>
		<div class="logo">
                    <a href="home.jsp"><img src="images/webschool.jpg" height="100" width="150"></a>
		</div>

		<div class="for">
			<h2><font color="blueviolet">Form Login Admin</font></h2>
		</div>

		<div class="login">
                    <form action="LoginServlet" method="post" >
			<table border="0">
                            <tr>
				<td><b><font color="blueviolet">Username</font></b></td>
				<td align="center"><font color="white">:</font></td>
                                <td><input type="text" name="username" id="uname" size="49" required ></td>
                            </tr>
                            <tr>
				<td><b><font color="blueviolet">Password</font></b></td>
				<td align="center"><font color="white">:</font></td>
				<td><input type="password" name="password" id="psw" size="49" required ></td>
                            </tr>
                            <tr>
				<td colspan="3" align="right">
                                    <br/>
                                    <input type="submit" value="SEND" />
                            </tr>
                        </table>
                    </form>
                </div>
	</header>
    </div>

    </body>
</html>
