<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
	<h1>Update details</h1>
</head>
<body>
<h1>Update medicine Detail</h1>
<form:form action="updateMedicine" modelAttribute="pharma" method ="post">
	<table class="table table-hover">
		<tr>
			<td>Medicine ID</td>
			<td><form:input path="medicineId" placeholder="Please enter medicine id" readonly="true"/></td>
		</tr>
		<tr>
			<td>Medicine Name</td>
			<td><form:input path="medicineName" placeholder="Please enter medicine name" readonly="true"/></td>
		</tr>
		<tr>
			<td>price</td>
			<td><form:input path="price" placeholder="Please enter price" /></td>
		</tr>
		<tr>
			<td>dose</td>
			<td><form:input path="dose" placeholder="Please enter dose" /></td>
		</tr>
		<tr>
			<td>grams</td>
			<td><form:input path="grams" placeholder="Please enter grams"/></td>
		</tr>
		<tr>
			<td><input type="submit" value="Update Medicine"></td>
			<td><input type="reset" value="Cancel"></td>
		</tr>
	</table>
</form:form>
</body>
</html>