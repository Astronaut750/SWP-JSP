<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link href="resources/Login.css" rel="stylesheet" type="text/css">
</head>
<body>

<div class="container">
	<h1 class="title">Login</h1>
	
	<form method="post" action="CheckLogin">
		
		<table>
			<tr class="marginVert">
				<td class="inputText">Email:</td>
				<td><input type="email" name="email"></td>
			</tr>
			<tr class="marginVert">
				<td class="inputText">Password:</td>
				<td><input type="password" name="password"></td>
			</tr>
		</table>
		
		<div class="title marginVert">
			<button type="submit">Senden</button>
			<a href="Register.jsp"><Button type="button">Register instead</Button></a>
		</div>
	</form>
</div>
<%
	String error = (String) request.getAttribute("errorMessage");
	if (error != null) {
		out.append("<p id='error'>" + error + "</p>");
	}
%>
</body>
</html>