<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<nav class="navbar navbar-expand-sm bg-light">

  <!-- Links -->
  <ul class="navbar-nav">
    <li class="nav-item">
      <a class="nav-link" href="Registration.jsp">Registration Form</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="Success.jsp">Success</a>
    </li>
  </ul>

</nav>

	<div class="container">
		<h2>Login Form</h2>
		<form action="loginServlet" method="post">
			<div class="form-group">
				<label for="email">Email:</label> <input type="email"
					class="form-control" id="email" name="email">
			</div>
			<div class="form-group">
				<label for="pswd">Password:</label> <input type="password"
					class="form-control" id="pswd" name="pswd">
			</div>
			<button type="submit" class="btn-danger btn-lg">Login</button>
		

			<a href="Registration.jsp "> click here to open registration form</a>

		</form>

		<h1> ${msg }</h1>
	</div></body>
</html>