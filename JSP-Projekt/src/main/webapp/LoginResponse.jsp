<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello
	<%		
		String u = (String) session.getAttribute("user");	
		if(u != null)
		{
			out.append(" "+ u);
		}
	%>
</h1>
<h1>user list <button onclick="HoleDaten()">Daten holen</button></h1>
<div id='Daten'></div>
<script>
	function HoleDaten()
	{
		alert("HoleDaten");
		const xhttp = new XMLHttpRequest();
		  xhttp.onload = function() 
		  {
			  //alert("onload:" + this.responseText);
			  // this.status;
			  // this.readyState;
			  // alert(this.responseText);
			  var arr = JSON.parse(this.responseText);
			  displayData(arr);
		  }
		  xhttp.open("Post", "DatenLesen", true);
		  xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
		  xhttp.send();	// Parameter als String mitgeben: name = wert%name=wert
	}
	function displayData(arr)
	{
		var i;
		var str = "<table>";
		for(i = 0; i<arr.length;i++)
		{
			var row = arr[i];
			str +="<tr>";
			str +="<td>" + row.email + "</td>";
			str +="<td>" + row.vorname + "</td>";
			str +="<td>" + row.nachname + "</td>";
			str +="</tr>";
		}
		str += "</table>";
		var elem = document.getElementById('Daten');
		elem.innerHTML= str;
	}
</script>
</body>
</html>