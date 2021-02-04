<%-- 
    Document   : hub
    Created on : Jul 19, 2020, 7:07:55 PM
    Author     : Putri Arina Kamilia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="description" content="Project">
  	<meta name="keywords" content="HTML, CSS, JavaScript, University">
	<link rel="stylesheet" type="text/css" href="css/hub.css">
	<link rel="icon" type="text/css" href="images/webschool.jpg">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script> 
		$(document).ready(function(){
  		$("#flip").click(function(){
    	$("#panel").slideToggle(1000);
  		});
		});
	</script>
        <title>WebSchool</title>
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
            <div class="name">
		<h2><font color="blueviolet">Give Us Critic and Suggestion</font></h2>
            </div>
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
            <div class="info">
		<form action="CommentServlet" method="get">
                    <table border="0">
			<tr>
                            <td><b><font color="blueviolet">Name</font></b></td>
                            <td><input type="text" name="nama" size="50" required ></td>
                        
                        
                        </tr>
                                               
                        <tr>
                            <td><b><font color="blueviolet">E-mail</font></b></td>
                        <td><input type="email" name="email" size="50" required></td>
                        
			</tr>
                        <tr>
                            <td valign="top"><b><font color="blueviolet">Critic and Suggestion</font></b></td>
                            <td><textarea cols="48" rows="5" name="pesan" required></textarea></td>
			</tr>
                        <tr>
                            <td colspan="3" align="right">
                                <br><button type="submit">Send</button>
                            <button type="reset">Reset</button></td>
			</tr>
                    </table>
		</form>
            </div>
		</header>
            
            <div class="cont">
		<div id="flip" class="kntk">
			<h2>Contact Us:</h2>
		</div>
		<div id="panel" class="kontak">
			<p>Web School Depok</p>
			<p>WebSchool-62442</p>
			<p>Phone	: 851891615</p>
			<p>Fax		: 820183738</p>
			<p>E-mail	: WebSchool@depok.com</p>
			<p>Twitter	: @WebSchool</p>
		</div>
		</div>
	</div>

    </body>
</html>
