<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<link href="resources/Register.css" rel="stylesheet" type="text/css">
</head>
<body>

<div class="backgroundImage">

<div class="container">
	<h1 class="title">Register</h1>
	
	<form method="post" action="CheckRegister">
		
		<table>
			<tr class="marginVert">
				<td class="inputText">Email:</td>
				<td><input type="email" name="email"></td>
			</tr>
			<tr class="marginVert">
				<td class="inputText">Firstname:</td>
				<td><input type="text" name="firstname"></td>
			</tr>
			<tr class="marginVert">
				<td class="inputText">Lastname:</td>
				<td><input type="text" name="lastname"></td>
			</tr>
			<tr class="marginVert">
				<td class="inputText">Password:</td>
				<td><input type="password" name="password"></td>
			</tr>
		</table>
		
		<div class="title marginVert">
			<button type="submit">Senden</button>
			<a href="Login.jsp"><Button type="button">Login instead</Button></a>
		</div>
	</form>
</div>
<%
	String error = (String) request.getAttribute("errorMessage");
	if (error != null) {
		out.append("<p id='error'>" + error + "</p>");
	}
%>
</div>
</body>
</html>