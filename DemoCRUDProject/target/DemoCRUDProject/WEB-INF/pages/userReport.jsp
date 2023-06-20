<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Report Page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
<h1 class="text-danger">User Report Detail</h1>
<table class="table">
      <thead>
        <tr>
          <th scope="col">ID</th>
          <th scope="col">Name</th>
          <th scope="col">Email</th>
          <th scope="col">City</th>
          <th scope="col">Street</th>
          <th scope="col">Edit</th>
      	  <th scope="col">Delete</th>
      	  <th scope="col">Detail</th>
        </tr>
      </thead>
      <tbody class="tbody">
        <c:forEach var="user" items="${user}">
          <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.email}</td>
            <td>${user.city }</td>
            <td>${user.street }</td>
            <td><a href="editUser/${user.id}" class="btn"> Edit </a></td>
            <td><a href="deleteUser/${user.id}" class="btn" onclick="return confirm('Are you sure want to delete?')"> Delete</a></td>
            <td><a href="userDetail/${user.id }" class="btn">Detail</a></td>
          </tr>
        </c:forEach>
      </tbody>
    </table>
    </div>
</body>
</html>