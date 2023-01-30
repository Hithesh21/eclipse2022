<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>x-workz</title>
</head>
<body>
<h2>this is jsp page....</h2>
<form action="Per" method="post">
<pre>
First Name<input type="text" name="first"/>
Last Name<input type="text" name="last"/>
Gender<input type="radio" id="male" name="gen"/>Male
      <input type="radio" id="female" name="gen"/>Female
Reason<textArea row="5" cols="10" name="reason"> </textArea>
Address<textArea row="5" cols="10" name="address"> </textArea>
<input type="submit" value="send"/>
</pre>
</form>
</body>
</html>