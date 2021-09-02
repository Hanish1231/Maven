<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Medicine details</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
<table class="table table-hover" border="1">
	<tr>
	<td>MedicineId</td>
	<td>MedicinetName</td>
	<td>price</td>
	<td>dose</td>
	<td>grams</td>
	</tr>
	<tr>
		<td>${pharma.medicineId}</td>
		<td>${pharma.medicineName}</td>
		<td>${pharma.price}</td>
		<td>${pharma.dose}</td>
		<td>${pharma.grams}</td>
		</tr>	
</table>

</body>
</html>