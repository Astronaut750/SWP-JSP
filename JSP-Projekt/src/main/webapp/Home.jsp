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
	
	<div class="coursesGrid">
		<div class="course">
			<img src="resources/courseReact.jpg"><br>
			<p class="courseTitle">React.js Course</p>
			<p class="courseVideos">48 Lessons á ~ 35 Minutes</p>
			<p class="coursePricing">1,900.00 $</p>
		</div>
		<div class="course">
			<img src="resources/courseAngular.jpg"><br>
			<p class="courseTitle">Angular Course</p>
			<p class="courseVideos">42 Lessons á ~ 30 Minutes</p>
			<p class="coursePricing">1,800.00 $</p>
		</div>
		<div class="course">
			<img src="resources/courseVue.jpg"><br>
			<p class="courseTitle">Vue.js Course</p>
			<p class="courseVideos">39 Lessons á ~ 45 Minutes</p>
			<p class="coursePricing">1,700.00 $</p>
		</div>
		<div class="course">
			<img src="resources/courseSvelte.jpg"><br>
			<p class="courseTitle">Svelte Course</p>
			<p class="courseVideos">37 Lessons á ~ 39 Minutes</p>
			<p class="coursePricing">1,500.00 $</p>
		</div>
	</div>
	
	
	
	<!--<div id="tableContainer">
		<table id="dataTable">
			<tr>
				<th>Email</th>
				<th>Vorname</th>
				<th>Nachname</th>
				<th>Passwort</th>
			</tr>
		</table>
	</div>-->
</div>

</div>
<script type="text/javascript">

function FetchCourses() {
	const xhttp = new XMLHttpRequest();
	xhttp.onload = function() {
		var courses = JSON.parse(this.responseText);
		outputCourses(courses);
	}
	xhttp.open("Post", "FetchCourses", true);
	xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
	xhttp.send();
}

function outputCourses {
	var str = '<div class="course"> <img alt="courseReact" src="resources/courseReact.jpg"><br>'
	<p class="courseTitle">React.js Course</p>
	<p class="courseVideos">48 Lessons á ~35 min</p>
	<p class="coursePricing">1,900.00 $</p>
</div>
}

</script>
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
		var str = "<tr>";
			str += "<th>Email</th>";
			str += "<th>Vorname</th>";
			str += "<th>Nachname</th>";
			str += "<th>Passwort</th>";
			str += "</tr>";
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
		dataTable.innerHTML = str;
	}
</script>
</body>
</html>