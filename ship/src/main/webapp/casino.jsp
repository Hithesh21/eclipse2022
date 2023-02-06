<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>x-workz</title>
</head>
<body>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
 rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
  crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
 integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
  crossorigin="anonymous"></script>

</head>
<body>
<!-- As a link -->
	<nav class="navbar navbar-expand-lg-navbar-Light bg-darl">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"><img
				src=" https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" width="80" height="48" class="d-inline-block align text-top">
			</a>
			<a href="index.jsp">Home</a>
		</div>
	</nav>
	<h1>showing Casino </h1>
	<form action="casino" method="post">
	<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Casino name</label>
  <input type="text"  class="form-control" name="name" id="exampleFormControlInput1"
   placeholder="casino name">
</div>
	<div class="mb-3">
 <label for="exampleFormControlInput1" class="form-label">Cruise</label>
  <input type="text"  class="form-control" name="cruise" id="exampleFormControlInput1"
   placeholder="cruise">
	</div>
		
			<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Entry fee
		</label> <input type="text" class="form-control"
				id="exampleFormControlInput1" placeholder="entry fee" name="entry">
		</div>
		
		<div class="mb-3">
 <label for="exampleFormControlInput1" class="form-label">free food</label><br>
 yes <input type="radio"  class="form-control" name="free" id="true">
  no <input type="radio"  class="form-control" name="free" id="false">
 
   	</div>
		
		<button type="submit" class="btn btn-success">send</button>
	</form>

</body>
</html>