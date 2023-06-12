<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
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
<div class="container-fluid">
<h1 class="text-danger">Add Book</h1>
    <form action="<%=request.getContextPath() %>/books/add" method="post">
    <div class="mb-3">
        <label for="title" class="form-label">Title:</label>
        <input type="text" id="title" name="title" class="form-control" required/>
        </div>
        <br/>
        <div class="mb-3">
        <label for="author" class="form-label">Author:</label>
        <div class="btn-group">
        <select id="author" name="author.id"  class="btn btn-lg btn-secondary dropdown-toggle dropdown-toggle-split" required>
            <c:forEach var="author" items="${authors}">
                <option value="${author.id}">${author.name}</option>
            </c:forEach>
        </select>
        </div>
        </div>
        <br/>
        <input type="submit" value="Add" class="btn btn-danger"/>
    </form>
    </div>
</body>
</html>