<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container mt-3">
  <h1>All Student</h1>
  <a href="addStudent" class="btn btn-primary"> Add Student </a>
  <div class="row">

    <table class="table table-hover">
      <thead>
        <tr>
          <th scope="col">ID</th>
          <th scope="col">Name</th>
          <th scope="col">Course</th>
          <th scope="col">Phone Number</th>
          <th scope="col">Address</th>
        </tr>
      </thead>
      <tbody class="tbody">
        <c:forEach var="student" items="${student}">
          <tr>
            <td class="table-plus">${student.id}</td>
            <td>${student.name}</td>
            <td>${student.course}</td>
            <td>${student.ph}</td>
            <td>${student.address}</td>
          </tr>
        </c:forEach>
      </tbody>
    </table>
  </div>
</div>
</body>
</html>