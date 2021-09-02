<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
<h1> get medicine Details</h1>
<form:form action="searchview" modelAttribute="Pharma" method="post">

	<table class="table table-hover">
		<tr>
			<td>Medicine ID</td>
			<td><form:input path="medicineId" placeholder="Please enter medicine id"/></td>
		</tr>
		<tr>
			<td><input type="submit" value="Search Medicine"></td>
			<td><input type="reset" value="Cancel"></td>
		</tr>
	</table>
	</form:form>


</body>
</html>