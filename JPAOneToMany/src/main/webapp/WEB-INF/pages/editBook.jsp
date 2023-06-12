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
<h1>Edit Book</h1>
    <form action="<%=request.getContextPath() %>/books/edit/${book.id}" method="post">
        <input type="hidden" name="_method" value="post"/>
        <label for="title">Title:</label>
        <input type="text" id="title" name="title" value="${book.title}" required/>
        <br/>
        <label for="author">Author:</label>
        <select id="author" name="author.id" required>
            <c:forEach var="author" items="${authors}">
                <option value="${author.id}" ${author.id == book.author.id ? 'selected' : ''}>${author.name}</option>
            </c:forEach>
        </select>
        <br/>
        <input type="submit" value="Save"/>
    </form>
</body>
</html>