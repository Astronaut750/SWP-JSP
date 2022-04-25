<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="models.*" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<link href="resources/Home.css" rel="stylesheet" type="text/css">
</head>
<body>

<div class="backgroundImage">
<div class="container">
	<div class="nav">
		<a href="Login.jsp"><div id="navLogin" class="navItem">Login</div></a>
		<a href="Register.jsp"><div id="navRegister" class="navItem">Register</div></a>
	</div>
	<h1>Welcome
		<%		
			String u = (String) session.getAttribute("user");	
			if(u != null)
			{
				out.append(" "+ u);
			}
		%>
	</h1>
	
	<div class="centeredText"><button onclick="FetchCourses()">Fetch courses from DB</button></div>
	
	<table>
	<%
		DBManager db = DBManager.getInstance();
		Connection con = db.getConnection();
		List<Course> cs = db.fetchCourses(con);
		for(Course c : cs){
			out.append("<tr>");
			out.append("<td>" + c.getCoursesId() + "</td>");
			out.append("<td>" + c.getTitle() + "</td>");
			out.append("<td>" + c.getVideosCount() + "</td>");
			out.append("<td>" + c.getVideosAvgLen() + "</td>");
			out.append("<td>" + c.getPrice() + "</td>");
			out.append("<td>" + c.getImageString() + "</td>");
			out.append("<td><a href='Aendern.jsp" +
					"?id=" + c.getCoursesId() + 
					"&title=" + c.getTitle() +
					"&videosCount=" + c.getVideosCount() +
					"&videosAvgLen=" + c.getVideosAvgLen() +
					"&price=" + c.getPrice() +
					"&imageString=" + c.getImageString() +
					"'>Aktualisieren</a></td>");
			out.append("</tr>");
		}
	%>
	</table>
	
	<div id="coursesData" class="coursesGrid">
	</div>
	
</div>
</div>
<script src="FetchCourses.js"></script>
</body>
</html>