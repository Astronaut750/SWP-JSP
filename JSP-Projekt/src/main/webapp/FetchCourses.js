/**
 * 
 */

function FetchCourses()
	{
		alert("Fetching courses data from Database");
		const xhttp = new XMLHttpRequest();
		  xhttp.onload = function() 
		  {
			  var arr = JSON.parse(this.responseText);
			  outputCourses(arr);
		  }
		  xhttp.open("Post", "FetchCourses", true);
		  xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
		  xhttp.send();
	}

function outputCourses(arr){	
	var str = "";
	for(var i = 0; i<arr.length;i++)
	{
		str += '<div class="course">';
		str += '<img src="'+ arr[i].imageString +'"><br>'
		str += '<p class="courseTitle">'+ arr[i].title +' Course</p>'
		str += '<p class="courseVideos">'+ arr[i].videosCount +' Lessons á ~ '+ arr[i].videosAvgLen +' Minutes</p>'
		str += '<p class="coursePricing">'+ arr[i].price +' $</p></div>'
	}
	var test = document.getElementById("coursesData");
	test.innerHTML = str;
}