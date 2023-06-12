<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container-fluid">
<h1>Author List</h1>
    <table class="table">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Action</th>
        </tr>
        <c:forEach var="author" items="${authors}">
            <tr>
                <td>${author.id}</td>
                <td>${author.name}</td>
                <td>
                    <a href="<%=request.getContextPath() %>/authors/delete/${author.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <a href="<%=request.getContextPath() %>/authors/add">Add Author</a>
    <a href="<%=request.getContextPath() %>/books/add">Add Book</a><br>
    </div>
</body>
</html>