<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome!</h1>
<a href="<%=request.getContextPath() %>/authors/add">AuthorForm</a><br>
<a href="<%=request.getContextPath() %>/books/add">BookForm</a><br>
</body>
</html>