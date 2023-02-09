<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>x-workz</title>
</head>
<body>
<h1>this is jsp page....</h1>
<form action="bake" method="post">
<pre>
Bakery Name<input type="text" name="name"/>
Bakery Owner Name<input type="text" name="owner"/>
Bakery Owner Married yes<input type="radio" id="true" name="married"/>
        No <input type="radio" id="false" name="married"/>
Bakery Owner WifeName <input type="text" name="wife"/> 
Bakery Owner daughterName<input type="text" name="daughter"/>
Bakery Famous For<input type="text" name="famous"/>
Bakery Since<input type="text" name="since"/>
<input type="submit" value="save"/>
</pre>
</form>
</body>
</html>