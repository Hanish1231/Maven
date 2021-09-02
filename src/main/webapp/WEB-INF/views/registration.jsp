<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
	<h1>Registration page</h1>
</head>
<body>
<spring:form action="addMedicine" modelAttribute="Pharma" method="post">
	<table class="table table-hover">
	<tr>
		<td>Student Id</td>
		<td><spring:input path="medicineId" placeholder="Please enter medicineId"/></td>
	</tr>
	<tr>
		<td>Student Name</td>
		<td><spring:input path="studentName" placeholder="Please enter medicine name"/></td>
	</tr>
	<tr>
		<td>price</td>
		<td><spring:input path="price" placeholder="Please enter price"/></td>
	</tr>
	<tr>
		<td>dose</td>
		<td><spring:input path="dose" placeholder="Please enter dose"/></td>
	</tr>
	<tr>
		<td>grams</td>
		<td><spring:input path="grams" placeholder="Please enter grams"/></td>
	</tr>
	<tr>
		<td><input type="submit" value="Register"></td>
		<td><input type="reset" value="Cancel"></td>
	</tr>
	</table>
</spring:form>
</body>
</html>