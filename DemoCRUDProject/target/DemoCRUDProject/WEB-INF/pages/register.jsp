<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
  <h1 class="text-danger">Add User</h1>
    <form:form action="insertUser" method="POST">
     <div class="form-group">
        <input type="hidden" name="action" value="${user.id}">
        <label for="name">Name:</label>
        <input type="text" name="name"  value="${user.name}"  class="form-control" required>
        </div>
        <div class="form-group">
        <label for="email">Email:</label>
        <input type="email" name="email"  value="${user.email}"  class="form-control" required>
        </div>
        <div class="form-group">
         <label for="city">City:</label>
         <input type="text" name="city" value="${user.city}" class="form-control" required/>
         </div>
         <div class="form-group">
          <label for="street">Street:</label>
          <input type="text" id="street" name="street" value="${user.street}" class="form-control" required/>
          </div>
        <button type="submit" class="btn btn-default">Submit</button>
    </form:form>
    </div>
</body>
</html>