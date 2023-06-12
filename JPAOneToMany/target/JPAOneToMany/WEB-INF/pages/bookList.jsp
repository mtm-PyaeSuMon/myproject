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
<h1>Book List</h1>
    <table class="table">
        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Author</th>
            <th>Action</th>
        </tr>
        <c:forEach var="book" items="${books}">
            <tr>
                <td>${book.id}</td>
                <td>${book.title}</td>
                <td>${book.author.name}</td>
                <td>
                    <a href="<%=request.getContextPath() %>/books/delete/${book.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <br/>
    <a href="<%=request.getContextPath() %>/books/add">Add Book</a>
    </div>
</body>
</html>