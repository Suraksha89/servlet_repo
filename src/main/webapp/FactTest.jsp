<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="FactDemo" method="post">
<h1> --Enter the number you want to calculate factorial for--</h1>
<input type="text" name="num1">


<input type="submit" value="Factorial">

</form>


<p>factorial is..</p>
${factorial}

</body>
</html>