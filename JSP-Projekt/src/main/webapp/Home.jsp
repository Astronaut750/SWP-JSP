<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
	<h1>Welcome
		<%		
			String u = (String) session.getAttribute("user");	
			if(u != null)
			{
				out.append(" "+ u);
			}
		%>
	</h1>
	<div class="centeredText"><button onclick="FetchUsers()">Fetch users from DB</button></div>
	<div id="tableContainer"><table id="dataTable">
	<tr>
		<th>Email</th>
		<th>Vorname</th>
		<th>Nachname</th>
		<th>Passwort</th>
	</tr>
	</table></div>
</div>

</div>
<script>
	function FetchUsers()
	{
		const xhttp = new XMLHttpRequest();
		  xhttp.onload = function() 
		  {
			  var arr = JSON.parse(this.responseText);
			  outputDataToTable(arr);
		  }
		  xhttp.open("Post", "FetchUsers", true);
		  xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
		  xhttp.send();
	}
	function outputDataToTable(arr)
	{
		var str = "";
		for(var i = 0; i<arr.length;i++)
		{
			str +="<tr>";
			str +="<td>" + arr[i].email + "</td>";
			str +="<td>" + arr[i].firstname + "</td>";
			str +="<td>" + arr[i].lastname + "</td>";
			str +="<td>" + arr[i].password + "</td>";
			str +="</tr>";
		}
		var dataTable = document.getElementById("dataTable");
		dataTable.innerHTML += str;
	}
</script>
</body>
</html>