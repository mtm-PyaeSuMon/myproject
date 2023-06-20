<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Edit Form Page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
<h1 class="text-danger">User Edit Form</h1>
<form:form action="updateUser" modelAttribute="updateUser" method="post">
<form:hidden path="id"/>
      <div class="form-group">
        <form:label path="name" for="name">Name:</form:label>
        <form:input path="name" value="${user.name}" type="text" id="name" class="form-control"/>
        </div>
        <div class="form-group">
        <form:label path="email" for="email">Email:</form:label>
        <form:input path="email"  value="${user.email}" type="email" id="email" class="form-control"/>
        </div>
        <div class="form-group">
        <form:label path="city" for="city">City:</form:label>
        <form:input path="city"  value="${user.address.city}" type="city" id="city" class="form-control"/>
        </div>
        <div class="form-group">
        <form:label path="street" for="street">Street:</form:label>
        <form:input path="street" value="${user.address.street}" type="street" id="street" class="form-control"/>
        </div>
         <button type="submit" class="btn btn-default">Update</button>
</form:form>
</div>
</body>
</html>