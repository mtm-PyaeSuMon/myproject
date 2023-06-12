<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Add Student Course</h1>
    <form action="<%=request.getContextPath() %>/student-course/save" method="post">
        <label for="studentId">Student:</label>
        <select id="studentId" name="studentId">
            <c:forEach var="student" items="${students}">
                <option value="${student.id}">${student.name}</option>
            </c:forEach>
        </select><br>
        <label for="courseId">Course:</label>
        <select id="courseId" name="courseId">
            <c:forEach var="course" items="${courses}">
                <option value="${course.id}">${course.name}</option>
            </c:forEach>
        </select><br>
        <input type="submit" value="Save">
    </form>
</body>
</html>