<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>




</head>
<body>
<nav class="navbar navbar-expand-sm bg-light">

  <!-- Links -->
  <ul class="navbar-nav">
    <li class="nav-item">
      <a class="nav-link" href="Login.jsp">Login Form</a>
    </li>

</nav>

<div class ="container">
<h2>Registration form</h2>
<form action="RegistrationServlet" method="post">
    <div class="form-group">
      <label >ID:</label>
      <input type="text" class="form-control"  name="empId">
    </div>
 
    <div class="form-group">
      <label >Email:</label>
      <input type="email" class="form-control"  name="email">
    </div>
    <div class="form-group">
      <label >Password:</label>
      <input type="password" class="form-control"  name="pswd">
    </div>
    
    <div class="form-group">
      <label >D.O.B:</label>
      <input type="text" class="form-control"  name="age">
    </div>
    
    <button type="submit" class="btn btn-primary">Register</button>
    
</form>
</div>



</body>
</html>