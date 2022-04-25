<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="models.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	int id = Integer.parseInt(request.getParameter("id"));
	String title = request.getParameter("title");
	String videosCount = request.getParameter("videosCount");
	String videosAvgLen = request.getParameter("videosAvgLen");
	double price = Double.parseDouble(request.getParameter("price"));
	String imageString = request.getParameter("imageString");
%>

<form method="post" action="UpdateCourse">
	<label>ID</label>
	<input type="text" readonly name="id" value="<%=id%>" > <br>
	
	<label>Title</label>
	<input name="title" value="<%=title %>"> <br>
	
	<label>VideosCount</label>
	<input name="videosCount" value="<%=videosCount%>"> <br>
	
	<label>VideosAvgLen</label>
	<input name="videosAvgLen" value="<%=videosAvgLen%>"> <br>
	
	<label>Price</label>
	<input name="price" value="<%=price%>"> <br>
	
	<label>ImageString</label>
	<input name="imageString" value="<%=imageString%>"> <br>
	
	<button type="submit">Absenden</button>
</form>

</body>
</html>