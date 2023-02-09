<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>w-workz</title>
</head>
<body>
<h4>this is display page in jsp</h4>
<span style='color:blue'> 
<h1>Bakery Saved, details:</h1>
<h2>
<label>name: ${bakery.name} </label><br>
<label> owner name: ${bakery.owner} </label><br>
<label> wife name: ${bakery.wife} </label><br>
<label> daughter name: ${bakery.daughter} </label><br>
<label> married: ${bakery.married} </label><br>
<label>famous: ${bakery.famous} </label><br>
<label>since: ${bakery.since} </label>
</h2>
</span>
</body>
<a href="index.jsp"> 
<br>
<input type="submit"  value="Home"/>
</a>
</html>