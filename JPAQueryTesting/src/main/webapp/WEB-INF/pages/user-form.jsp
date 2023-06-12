<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
</head>
<body>
<div class="container">
<h1>Create User</h1>
    <form method="post" action="<%=request.getContextPath() %>/insertUser">
     <div class="form-group">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" class="form-control" required>
        </div>
        
        <div class="form-group">
        <label for="street">Street:</label>
        <input type="text" id="street" name="address.street" class="form-control" required>
        </div>
        
         <div class="form-group">
        <input type="submit" value="Create">
        </div>
    </form>
    </div>
</body>
</html>