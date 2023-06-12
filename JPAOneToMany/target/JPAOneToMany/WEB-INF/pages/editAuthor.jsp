<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Edit Author</h1>
    <form action="<%=request.getContextPath() %>/authors/edit/${author.id}" method="post">
        <input type="hidden" name="_method" value="post"/>
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" value="${author.name}" required/>
        <br/>
        <input type="submit" value="Save"/>
    </form>
</body>
</html>