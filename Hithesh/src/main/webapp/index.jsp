<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HITHESH</title>
</head>
<body>
<h2>THIS PAGE IS FOR DISPLAY BUTTON</h2>
<pre>
<form action="email">
<label>Display email : ${email}</label>
<input type="submit" value="show email"/>
</form></pre>
<form action="mobile">
<pre>

<label>Display mobile : ${mobile}</label>
<input type="submit" value="show mobile"/></pre>

</form>
<form action="aadhar"><pre>
<label>Display Aadhar : ${aadhar}</label>
<input type="submit" value="aadhar"/></pre>
</form>
<form action="age"><pre>
<label>Display Age : ${age}</label>
<input type="submit" value="show Age"/></pre>
</form>
<form action="dob"><pre>
<label>Display DOB : ${dob}</label>
<input type="submit" value="show dob"/>
</form>
<form action="salary"><pre>
<label>Display salary : ${salary } </label>
<input type="submit" value="show salary"/></pre>
</form>
<form action="best">
<pre>
<ul>
			<label>BestFriend </label>
			<input type="submit" value="Bestfriend" />
			<c:forEach items="${best}" var="name">
				<li>${name}</li>

			</c:forEach>
		</ul>
		</pre>
	</form>


<form action="most">
<pre>
<ul>
			<label>Most Visited Places </label>
			<input type="submit" value="places" />
			<c:forEach items="${most}" var="name">
				<li>${name}</li>

			</c:forEach>
		</ul>
		</pre>
		</form>
		
<form action="skill">
<pre>
<ul>
			<label>Skills </label>
			<input type="submit" value="Skills" />
			<c:forEach items="${skill}" var="name">
				<li>${name}</li>

			</c:forEach>
		</ul>
		</pre>
	

</form>
</body>
</html>