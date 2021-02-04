<%-- 
    Document   : galeri
    Created on : Jul 19, 2020, 6:59:08 PM
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
	<link rel="stylesheet" type="text/css" href="css/galeri.css">
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
		<div class="logo" >
                    <a href="home.jsp"><img src="images/webschool.jpg" height="100" width="150"></a>
		</div>
		
		<div class="slidershow middle">
      	<div class="slides">
        <input type="radio" name="r" id="r1" checked>
        <input type="radio" name="r" id="r2">
        <input type="radio" name="r" id="r3">
        <input type="radio" name="r" id="r4">
        <input type="radio" name="r" id="r5">
        <input type="radio" name="r" id="r6">
        <div class="slide s1">
          <img src="images/1.jpg" alt="">
        </div>
        <div class="slide">
          <img src="images/2.jpg" alt="">
        </div>
        <div class="slide">
          <img src="images/3.jpg" alt="">
        </div>
        <div class="slide">
          <img src="images/4.jpg" alt="">
        </div>
        <div class="slide">
          <img src="images/5.jpg" alt="">
        </div>
        <div class="slide">
          <img src="images/6.jpg" alt="">
        </div>
        
      <div class="navigation">
        <label for="r1" class="bar"></label>
        <label for="r2" class="bar"></label>
        <label for="r3" class="bar"></label>
        <label for="r4" class="bar"></label>
        <label for="r5" class="bar"></label>
        <label for="r6" class="bar"></label>
        
		</header>
	</div>
    </body>
</html>
