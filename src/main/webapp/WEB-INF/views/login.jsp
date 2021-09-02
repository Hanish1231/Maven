<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


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
<body background="login.jpg">
	<h2>Login Screen</h2> 
	<mvc:form  action="login" method="post">    
		<table class="table table-hover">
			<tr>
			<td colspan="2">
			<c:if test="${param.error != null}">
				<div class="alert alert-danger">Invalid Username or Password. Please try again!!!</div>
			</c:if>
			<c:if test="${param.logout != null}">
				<div class="alert alert-success">You Logout successfully !!</div>
			</c:if>
			</td>
			</tr>        
			<tr>
				<td> Username </td>
				<td><input type="text" placeholder="Please enter username" name="username" id="username"/></td>
			</tr>
			<tr>
				<td> Password</td>
				<td><input type="password" placeholder="Please enter password" name="password" id="password"/></td>
			</tr>
			
			<tr>
				<td>
				<input type="hidden" name="${_csrf.parameterName}"   value="${_csrf.token}" />
				<input type="submit" value="Sign In"/></td>
			</tr>
		</table>
	</mvc:form>

</body>
</html>
