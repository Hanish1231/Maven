<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
    
        
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Access Denied</title>
</head>
<body>

	
	   <div class="container-fluid">
                      <div class="card shadow mb-4">
                        <div class="card-header py-3">
                            <h6 class="m-0 font-weight-bold text-danger">Error Message</h6>
                        </div>
                        <div class="card-body">
		
	
	
				<div class="container">
			
					 <div class="card bg-danger text-white shadow">
							<div class="card-body">
							 
							Dear ${user} , <br>
							You are not authorized to access this page!
					                                            
							</div>
					</div>
				</div>
				
		

</div>
</div>
</div>


</body>
</html>