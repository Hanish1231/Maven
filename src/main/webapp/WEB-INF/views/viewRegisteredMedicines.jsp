<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
<h1>Registered Medicines</h1>
<table class="table table-hover">
  <thead class="thead-dark">
    <tr>
      <th scope="col">medicineId</th>
      <th scope="col">medicineName</th>
      <th scope="col">price</th>
      <th scope="col">dose</th>
      <th scope="col">grams</th>
    </tr>
  </thead>
  <c:forEach var="pharma" items="${Pharma}">
	<c:url value="/editMedicine?medicineId=${pharma.medicineId} " var="editMedicineUrl" />
	<c:url value="/deleteMedicine?medicineId=${pharma.medicineId} " var="deleteMedicineUrl" />
  <tbody>
    <tr>
      <td>${pharma.medicineId}</td>
		<td>${pharma.medicineName}</td>
		<td>${pharma.price}</td>
		<td>${pharma.dose}</td>
		<td>${pharma.grams}</td>
		<td><a href="${editMedicineUrl}">Edit</a></td>
		<td><a href="${deleteMedicineUrl}">Delete</a></td>
    </tr>
  </tbody>
  </c:forEach>
</table>
<a href="registration">Click here to register new medicine</a>
</body>
</html>