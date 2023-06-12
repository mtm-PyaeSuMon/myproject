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
<h1>Enroll Student in Course</h1>
    <form action="${action}" method="POST">
        <table>
            <tr>
                <td>Student:</td>
                <td>
                    <select name="studentId">
                        <c:forEach var="student" items="${students}">
                            <option value="${student.id}">${student.name}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <td>Course:</td>
                <td>
                    <select name="courseId">
                        <c:forEach var="course" items="${courses}">
                            <option value="${course.id}">${course.name}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="Enroll"/>
                </td>
            </tr>
        </table>
    </form>
</body>
</html>