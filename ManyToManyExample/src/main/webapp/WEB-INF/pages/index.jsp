<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to the Student-Course Management System!</h1>
<a href="<%=request.getContextPath() %>/students/add">StudentForm</a><br>
<a href="<%=request.getContextPath() %>/courses/add">CourseForm</a><br>
<a href="<%=request.getContextPath() %>/student-course/add">StudentCourseForm</a>
</body>
</html>